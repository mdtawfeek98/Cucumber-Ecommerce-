package com.java.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4j {

	static Logger log;
	
	public Logger loadLogger(Class<?> className) {
		Logger log = LoggerFactory.getLogger(className);
		return log;
	}
	
}
