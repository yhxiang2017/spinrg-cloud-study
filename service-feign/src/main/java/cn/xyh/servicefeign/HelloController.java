package cn.xyh.servicefeign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Create by xyh on 2018/12/5
 */
@RestController
public class HelloController {

    @Resource
    private HelloFeign helloFeign;

    @GetMapping("/api/hello")
    public String hello() {
        return helloFeign.hello();
    }

    @GetMapping("/api/error")
    public String error() {
        return helloFeign.error();
    }

    @GetMapping("/api/errorRequest")
    public String errorRequest() {
        return helloFeign.errorRequest();
    }
}
