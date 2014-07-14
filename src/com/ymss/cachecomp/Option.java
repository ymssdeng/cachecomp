package com.ymss.cachecomp;

import de.tototec.cmdoption.CmdOption;
import de.tototec.cmdoption.handler.IntegerHandler;
import de.tototec.cmdoption.handler.StringFieldHandler;

public class Option {

	@CmdOption(names = { "--help", "-h" }, description = "Show this help.", isHelp = true)
	private boolean help;

	@CmdOption(names = { "--cache", "-c" }, args = { "value" }, description = "Memcached or basin cache", handler = StringFieldHandler.class)
	private String cache;

	@CmdOption(names = { "--mode", "-m" }, args = { "value" }, description = "Test add or get", handler = StringFieldHandler.class)
	private String mode;

	@CmdOption(names = { "--number", "-n" }, args = { "value" }, description = "Number of objects to add or get", handler = IntegerHandler.class)
	private int num;

	public boolean isHelp() {
		return help;
	}

	public String getCache() {
		return cache;
	}

	public String getMode() {
		return mode;
	}

	public int getNum() {
		return num;
	}
}
