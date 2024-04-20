package com.zp.springboottest.service.impl;

import com.zp.springboottest.service.Pay;
import org.springframework.stereotype.Service;

/**
 * @author zp
 * @date 2024/4/9 009
 */
@Service("wxPay")
public class WXPay implements Pay {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
