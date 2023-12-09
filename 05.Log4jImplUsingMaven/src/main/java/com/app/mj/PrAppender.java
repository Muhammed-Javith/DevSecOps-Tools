package com.app.mj;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;

public class PrAppender {
	private static Logger log = Logger.getLogger(PrHtmlLayout.class); //for all
	public static void main(String[] args) throws IOException {
		Layout layout=new HTMLLayout();
		Appender ap=new FileAppender(layout,"myapp.log");
		log.addAppender(ap);
		log.debug("Hello");
		log.info("Hello");
		log.warn("Hello");
		log.error("Hello");
		log.fatal("Hello");
	}

}
