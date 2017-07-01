package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoenwei on 2017/6/29.
 */
@RestController
public class DemoController {
//
//    @Qualifier("discoveryClient")
//    @Autowired
//    DiscoveryClient client;

    //    @RequestMapping("/abc")
//    public  String getSentence() {
//        return
//                getWord("mmb-eureka-subject") + " "
//        + getWord("mmb-eureka-subject") + "."
//        ;//大小写不区分
//    }
//    public String getWord(String service) {
//        List<ServiceInstance> list = client.getInstances(service);
//        int i = (int)Math.round(Math.random() * (list.size() - 1));
//        if (list != null && list.size() > 0 ) {
//            URI uri = list.get(i).getUri();
//            if (uri !=null ) {
//                return (new RestTemplate()).getForObject(uri,String.class);
//            }
//        }
//        return null;
//    }
    @Autowired
    private WordFeignClient wordFeignClient;

    @RequestMapping("/abc")
    public String getSentence() {
        return wordFeignClient.getWord() + wordFeignClient.getWord();
    }
}
