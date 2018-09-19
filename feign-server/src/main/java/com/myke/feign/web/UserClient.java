package com.myke.feign.web;

import com.myke.feign.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： zhangjianbin <br/>
 * ===============================
 * Created with IDEA.
 * Date： 2018/9/19 10:39
 * ================================
 */
@RestController
public class UserClient {
    @Autowired
    public OrderClient orderClient;

    @GetMapping(value = "/user")
    public String getAddress() {
        return orderClient.getAddress();
    }
}
