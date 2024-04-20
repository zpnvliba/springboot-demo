package com.example.springbootredis.config;

/**
 * @author zp
 * @date 2024/4/20 020
 */

import cn.hutool.core.util.StrUtil;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 给Feign请求设置请求头
 */
@Slf4j
@Configuration
public class FeignTokenConfig implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Accept", "application/json");
        String token = null;
        // 从当前线程的http实例获取token，可以根据实际情况获取token
        try {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (attributes != null) {
                HttpServletRequest request = attributes.getRequest();
                token = request.getHeader("Authorization");
            }
        } catch (Exception e) {
            log.error("通过request获取token失败", e);
        }

        // 通过向认证中心获取token
        if (StrUtil.isBlank(token)) {
            try {
                token = "hahahahaaha";
            } catch (Exception e) {
                log.error("向认证中心获取token失败", e);
            }
        }

        if (StrUtil.isNotBlank(token)) {
            // 我这里只加了token请求头，需要其他的可以按需求添加
            requestTemplate.header("Authorization", token);
            log.info("feign客户端设置请求头>>> Authorization:{}", token);
        } else {
            log.error("token获取失败");
        }
    }
}
