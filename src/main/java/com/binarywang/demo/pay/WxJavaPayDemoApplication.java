package com.binarywang.demo.pay;

import com.github.binarywang.wxpay.service.WxPayService;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class WxJavaPayDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(WxJavaPayDemoApplication.class, args);
    }

    @Autowired
    private WxPayService wxPayService;

    @GetMapping("/test")
    public String test() throws WxErrorException {
        return this.wxPayService.getPayBaseUrl();
    }
}
