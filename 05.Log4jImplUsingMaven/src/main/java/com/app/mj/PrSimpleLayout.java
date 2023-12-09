package com.app.mj;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class PrSimpleLayout {
	private static Logger log = Logger.getLogger(PrSimpleLayout.class); //for all

	public static void main(String[] args) {
	//Simple Layout
		Layout layout = new SimpleLayout();
		Appender ap = new ConsoleAppender(layout);
		log.addAppender(ap);
		log.info("Hello");
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