package com.zp.springboottest.category;


import com.zp.springboottest.service.Pay;
import com.zp.springboottest.service.impl.AliPay;
import com.zp.springboottest.service.impl.WXPay;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zp
 * @date 2024/4/9 009
 */
// @Component
public class PayCategory {
    // @Autowired
    private static Map<String,Pay> payMap = new ConcurrentHashMap<>();
    static{
        payMap.putIfAbsent("ALI_PAY", new AliPay());
        payMap.putIfAbsent("WX_PAY", new WXPay());
    }


    public static Pay selectPay(String type) {
        return payMap.get(type);
    }
}
