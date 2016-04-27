package kr.co;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	static final Logger log = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.trace("This is TRACE Log!");
		log.debug("This is DEBUG Log!");
		log.info("This is INFO Log!");
		log.warn("This is WARN Log!");
		log.error("This is ERROR Log!");
	}
}
