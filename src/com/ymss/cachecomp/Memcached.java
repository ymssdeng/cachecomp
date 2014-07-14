package com.ymss.cachecomp;

import com.meetup.memcached.MemcachedClient;
import com.meetup.memcached.SockIOPool;

public abstract class Memcached {

	protected MemcachedClient client;

	public Memcached() {
		String[] serverlist = { "localhost:12345" };

		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(serverlist);
		pool.initialize();

		client = new MemcachedClient();
	}

	public abstract void add(CacheObject obj);

	public abstract CacheObject get(String key);
}
