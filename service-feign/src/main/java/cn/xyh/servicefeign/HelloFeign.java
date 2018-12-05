package cn.xyh.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Create by xyh on 2018/12/5
 */
@FeignClient(value = "eureka-client", fallback = SchedualServiceHiHystric.class)
public interface HelloFeign {

    @GetMapping("/hello-eureka")
    String hello();

    @GetMapping("/error")
    String error();

    @GetMapping("/errorRequest")
    String errorRequest();
}
