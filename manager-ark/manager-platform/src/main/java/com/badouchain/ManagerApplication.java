package com.badouchain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import com.badouchain.chaincode.fabric.SDKTestV1;
import com.badouchain.chaincode.fabric.SDKTestV2;

@SpringBootApplication
public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
        new SDKTestV1().test();
		new SDKTestV2().test();
    }

}
