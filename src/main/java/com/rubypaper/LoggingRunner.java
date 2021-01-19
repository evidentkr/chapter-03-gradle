package com.rubypaper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

//이 클래스는 존재하는 것만으로도 서버가 기동될 때 호출된다. 신기함
@Service
public class LoggingRunner implements ApplicationRunner{
	
	private Logger logger = LoggerFactory.getLogger(LoggingRunner.class);

	@Override
	public void run(ApplicationArguments args) throws Exception {

		logger.trace("trace 로그메시지");
		logger.debug("debug 로그메시지");
		logger.info("info 로그메시지");
		logger.warn("warn 로그메시지");
		logger.error("error 로그메시지");
	}
}