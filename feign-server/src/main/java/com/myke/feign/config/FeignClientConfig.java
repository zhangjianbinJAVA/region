package com.myke.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author： zhangjianbin <br/>
 * ===============================
 * Created with IDEA.
 * Date： 2018/9/19 10:42
 * ================================
 */
@Configuration
public class FeignClientConfig {

    @Bean
    public Logger.Level logger() {
        return Logger.Level.FULL;
    }
}
