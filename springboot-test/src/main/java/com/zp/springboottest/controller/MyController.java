package com.zp.springboottest.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp
 * @date 2024/4/18 018
 */
@RestController
public class MyController {

    @PostMapping("/sso/oauth2/authorize")
    public String get(@RequestBody String str) {
        return JSON.toJSONString(str);
    }
}
