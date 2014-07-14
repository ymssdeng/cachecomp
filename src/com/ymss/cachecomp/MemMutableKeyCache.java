package com.ymss.cachecomp;

public class MemMutableKeyCache extends MemBasicCache {

	@Override
	public synchronized void add(CacheObject obj) {
		// id key
		client.add(obj.getId(), obj);

		// name key
		client.add(obj.getName(), obj);
	}

}
