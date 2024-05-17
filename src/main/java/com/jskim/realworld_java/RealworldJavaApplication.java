package com.jskim.realworld_java;

import com.jskim.realworld_java.config.ssl.SSLUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RealworldJavaApplication {

	public static void main(String[] args) {
		SSLUtil.disableSSLVerification();

		SpringApplication.run(RealworldJavaApplication.class, args);
	}

}
