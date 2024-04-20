package com.example.springbootredis.controller;

import com.example.springbootredis.service.CommonFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp
 * @date 2024/4/18 018
 */
@RestController
public class MyController {
    @Autowired
    private CommonFeignService commonFeignService;

    @GetMapping(value = "/aaa")
    public String bbb(@RequestParam("str") String str) {
        return commonFeignService.authorize(str);
    }

}
