package cn.xyh.servierribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Create by xyh on 2018/12/5
 */
@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String helloService () {
        return restTemplate.getForObject("http://eureka-client/hello-eureka", String.class);
    }

    public String fallBack() {
        return "This is a fallBack method!";
    }
}
