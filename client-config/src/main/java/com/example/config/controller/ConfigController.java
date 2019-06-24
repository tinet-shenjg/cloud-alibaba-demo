package com.example.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description: ConfigController <br>
 * <p>
 * date 2019/06/24 <br>
 * author: shenjg <br>
 */
@Slf4j
@RestController
public class ConfigController {

    @NacosValue(value = "${shenjgspace.title:123}", autoRefreshed = true)
    private String title;

    @GetMapping("/test")
    public String hello() {
        return title;
    }
}
