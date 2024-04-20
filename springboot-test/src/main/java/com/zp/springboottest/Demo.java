package com.zp.springboottest;

import com.zp.springboottest.category.PayCategory;
import com.zp.springboottest.service.Pay;

/**
 * @author zp
 * @date 2024/4/9 009
 */
public class Demo {
    public static void main(String[] args) {

        String payType = "ALI_PAY";
        // Pay pay = PayEnum.getPay(payType);
        // pay.pay();

        PayCategory payCategory = new PayCategory();
        Pay pay = payCategory.selectPay(payType);
        pay.pay();
    }
}
