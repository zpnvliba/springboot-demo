package com.example.springbootredis.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "${user.service.url}", name = "user-service")
public interface CommonFeignService {

    @PostMapping("/sso/oauth2/authorize")
    String authorize(@RequestBody String json);

}