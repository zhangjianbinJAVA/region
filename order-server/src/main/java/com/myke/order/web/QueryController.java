package com.myke.order.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author： zhangjianbin <br/>
 * ===============================
 * Created with IDEA.
 * Date： 2018/9/18 10:28
 * ================================
 */
@RestController
public class QueryController {

    @Value("${eureka.instance.metadata-map.zone}")
    private String zone;

    @GetMapping
    public String getAddress() {
        return zone;
    }
}
