package com.myke.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author： zhangjianbin <br/>
 * ===============================
 * Created with IDEA.
 * Date： 2018/9/19 10:36
 * ================================
 */
@FeignClient(name = "order-server")
public interface OrderClient {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getAddress();
}
