package com.ymss.cachecomp;


public class Comp {

	public static void main(String[] args) {

		System.out.println("-----------------------------------");
		/*Option opt = new Option();
		CmdlineParser cp = new CmdlineParser(opt);
		cp.parse(args);

		if (opt.isHelp()) {
			cp.usage();
			System.exit(0);
		}*/

		/*if (opt.getCache().equals("memcached")) {
			Memcached mem = new MemBasicCache();
			addToMemCache(mem, opt.getNum());
		} else if (opt.getCache().equals("basin")) {
			BasinBasicCache bc = new BasinBasicCache();
			addToBasinCache(bc, opt.getNum());
		}*/
	}

	/*private static void addToBasinCache(BasinBasicCache bc, int num) {
		for (int i = 0; i < num; i++) {
			CacheObject entry = new CacheObject();
			bc.addMarshalledItem(entry);
		}
	}

	private static void addToMemCache(Memcached mem, int num) {
		for (int i = 0; i < num; i++) {
			CacheObject entry = new CacheObject();
			mem.add(entry);
		}
	}*/

	/*private static TSSEntry genEntry() {
		TSSEntry entry = new TSSEntry();
		entry.setEntryID(UUID.randomUUID().toString());
		entry.setEntryClass((short) 1);
		TSSEntryEntityList lst = new TSSEntryEntityList();
		lst.addTSSEntryEntity(new TSSEntryEntity());
		entry.setTSSEntryEntityList(lst);
		return entry;
	}*/

}
