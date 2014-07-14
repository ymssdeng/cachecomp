package com.ymss.cachecomp;


public class MemBasicCache extends Memcached {

	@Override
	public synchronized void add(CacheObject obj) {
		client.add(obj.getId(), obj);
	}

	@Override
	public synchronized CacheObject get(String key) {
		return (CacheObject) client.get(key);
	}
}
