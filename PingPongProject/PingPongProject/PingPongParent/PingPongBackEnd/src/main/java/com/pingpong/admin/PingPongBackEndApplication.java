package com.pingpong.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({"com.pingpong.common.entity", "com.pingpong.admin.user"})
public class PingPongBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(PingPongBackEndApplication.class, args);
	}

}
