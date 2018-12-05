package cn.xyh.client;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

	@Value("${server.port}")
	private String port;

	@GetMapping("/hello-eureka")
	public String hello () {
		return "hello,I'm from eureka-client. and prot is : ["+ port +"]";
	}

	@GetMapping("/error")
	public String error() {
        int randomNum = RandomUtils.nextInt(10);

        if (randomNum > 5) {
            return "请求成功, 随机数是: " + randomNum;
        }else {
            return "请求失败, 随机数是: " + randomNum;
        }
    }

    @GetMapping("errorRequest")
    public String errorRequest () {
	    int i = 1 / 0;
	    return "error";
    }
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
