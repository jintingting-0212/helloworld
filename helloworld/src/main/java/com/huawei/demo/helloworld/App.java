package com.huawei.demo.helloworld;

/**
 * Hello world!
 *
 */
import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.apache.servicecomb.tracing.zipkin.EnableZipkinTracing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
@EnableZipkinTracing
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}