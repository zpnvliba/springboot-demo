package com.zp.springboottest.category;


import com.zp.springboottest.service.Pay;
import com.zp.springboottest.service.impl.AliPay;
import com.zp.springboottest.service.impl.WXPay;

/**
 * @author zp
 * @date 2024/4/9 009
 */
public enum PayEnum {
    ALI_PAY("AliPay", new AliPay()),
    WX_PAY("WXPay", new WXPay());

    private String code;
    private Pay pay;
    PayEnum(String code, Pay pay) {
        this.code = code;
        this.pay = pay;
    }

    public static Pay getPay(String code) {
        for (PayEnum payEnum : PayEnum.values()) {
            if (payEnum.code.equals(code)) {
                return payEnum.pay;
            }
        }
        return null;
    }

}
