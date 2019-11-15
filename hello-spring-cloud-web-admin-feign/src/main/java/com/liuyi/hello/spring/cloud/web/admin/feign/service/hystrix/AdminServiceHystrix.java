package com.liuyi.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.liuyi.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("your error is : %s but bad request",message);
    }
}
