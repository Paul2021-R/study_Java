package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// 스프링 어플리케이션을 실행 -> 자체 내장 서버를 가동시켜서 TOMCAT을 통해 서버가 가동된다.
		SpringApplication.run(HelloSpringApplication.class, args);

	}

}
