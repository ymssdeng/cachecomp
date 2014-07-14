package com.ymss.cachecomp;

import com.tamalesoftware.basin.MarshalledObject;
import com.tamalesoftware.basin.cache.CachedHashMutableKey;

public class BasinMutableKeyCache extends CachedHashMutableKey {

	@Override
	public String getIDFromObject(MarshalledObject arg0) {
		CacheObject obj = (CacheObject) arg0;
		return obj.getId();
	}

	@Override
	public String getKeyFromObject(MarshalledObject arg0) {
		CacheObject obj = (CacheObject) arg0;
		return obj.getName();
	}

}
