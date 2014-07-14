package com.ymss.cachecomp;

import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.UUID;

import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.ValidationException;

import com.tamalesoftware.basin.MarshalledObject;
import com.tamalesoftware.basin.ValidationOverride;

public class CacheObject extends MarshalledObject {

	private static final long serialVersionUID = 7087796283972018177L;
	private String id = UUID.randomUUID().toString();
	private String name = "Cache Object";
	private byte[] data = ByteBuffer.allocate(1024 * 2).array();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	@Override
	public void marshal(Writer out) throws MarshalException,
			ValidationException {
		try {
			Marshaller m = new Marshaller(out);
			m.setValidation(ValidationOverride.validate());
			m.marshal(this);
		} catch (IOException e) {
			throw new org.exolab.castor.xml.MarshalException();
		}

	}

}
