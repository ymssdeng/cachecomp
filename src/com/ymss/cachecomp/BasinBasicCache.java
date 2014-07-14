package com.ymss.cachecomp;

import com.tamalesoftware.basin.MarshalledObject;
import com.tamalesoftware.basin.cache.CachedHash;

public class BasinBasicCache extends CachedHash {

	@Override
	public String getKeyFromObject(MarshalledObject arg0) {
		CacheObject entry = (CacheObject) arg0;
		return entry.getId();
	}

}
