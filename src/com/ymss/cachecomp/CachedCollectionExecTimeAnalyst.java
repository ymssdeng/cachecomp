package com.ymss.cachecomp;

import java.util.ArrayList;
import java.util.List;

import com.tamalesoftware.basin.cache.CachedCollection;

public class CachedCollectionExecTimeAnalyst {

	private static final int NUM = 100_000;
	private static List<BasinBasicCache> basic = new ArrayList<>();
	private static List<BasinMutableKeyCache> multable = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static List<CacheObject> prepare() {
		List<CacheObject> lst = new ArrayList<CacheObject>();
		for (int i = 0; i < NUM; i++) {
			lst.add(new CacheObject());
		}
		return lst;
	}
}
