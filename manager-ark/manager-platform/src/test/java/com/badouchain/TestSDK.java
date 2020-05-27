package com.badouchain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.ui.Model;

import com.alipay.sofa.ark.support.runner.ArkJUnit4Runner;
import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import com.badouchain.chaincode.fabric.SDKTestV1;
import com.badouchain.chaincode.fabric.SDKTestV2;

@RunWith(ArkJUnit4Runner.class)	
public class TestSDK {
	
    @Test
	public void index() {
    	new SDKTestV1().test();
		new SDKTestV2().test();
	}	
}	