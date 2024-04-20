package com.zp.springboottest.category;

import com.zp.springboottest.service.Pay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author zp
 * @date 2024/4/9 009
 * 使用Spring 上下文充当策略上下文
 */

@Service
public class SpringCategory {
    private Pay pay;

    @Autowired
    private ApplicationContext context;


    public Pay selectPay(String type)
    {
        Pay bean = context.getBean(type, Pay.class);
        return bean;
    }
}
