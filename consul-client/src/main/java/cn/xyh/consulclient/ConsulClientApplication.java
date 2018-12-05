package cn.xyh.consulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsulClientApplication {

	@GetMapping("/hello-consul")
	public String hello() {
		return "hello, I'm from consul-client.";
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsulClientApplication.class, args);
	}
}
