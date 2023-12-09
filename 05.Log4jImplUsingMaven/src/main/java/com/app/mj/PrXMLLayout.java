package com.app.mj;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

public class PrXMLLayout {
	private static Logger log = Logger.getLogger(PrHtmlLayout.class); //for all
	public static void main(String[] args) {
		Layout layout=new XMLLayout();
		 Appender ap=new ConsoleAppender(layout);
		 log.addAppender(ap);
		 
		 log.debug("Hello");
		 log.info("Hello");
		 log.warn("Hello");
		 log.error("Hello");
		 log.fatal("Hello");

	}

}
