package cn.xyh.servicefeign;

import org.springframework.stereotype.Component;

/**
 * Create by xyh on 2018/12/5
 */
@Component
public class SchedualServiceHiHystric implements HelloFeign {

    @Override
    public String hello() {
        return "sorry";
    }

    @Override
    public String error() {
        return "sorry";
    }

    @Override
    public String errorRequest() {
        return "sorry";
    }
}
