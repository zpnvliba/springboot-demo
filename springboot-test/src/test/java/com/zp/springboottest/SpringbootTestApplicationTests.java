package com.zp.springboottest;

import com.zp.springboottest.category.PayCategory;
import com.zp.springboottest.category.SpringCategory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootTestApplicationTests {

    @Autowired
    private SpringCategory springCategory;
    // @Autowired
    // private PayCategory payCategory;

   @Test
    public void test(){
        // PayCategory payCategory = new PayCategory();
       System.out.println(PayCategory.selectPay("ALI_PAY"));
       System.out.println(PayCategory.selectPay("ALI_PAY"));
       System.out.println(PayCategory.selectPay("ALI_PAY"));
   }

}
