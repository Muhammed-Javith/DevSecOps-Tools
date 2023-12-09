package com.app.mj;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;

public class PrHtmlLayout {
	private static Logger log = Logger.getLogger(PrHtmlLayout.class); //for all

	public static void main(String[] args) {
	//HTML Layout
		Layout lay = new HTMLLayout();
		Appender apd = new ConsoleAppender(lay);
		log.addAppender(apd);

		log.debug("Hello");
		log.info("Hello");
		log.warn("Hello");
		log.error("Hello");
		log.fatal("Hello");
	

	}
}