package com.example.demo;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhaoenwei on 2017/7/1.
 */
@FeignClient("mmb-eureka-subject")
public interface WordFeignClient {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getWord();

}
