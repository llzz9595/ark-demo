package com.badouchain.chaincode.fabric;

import org.hyperledger.fabric.sdk.Channel;

public class SDKTestV1 {
	public  void test() {
		System.out.println("i am version 1.0.2");
		System.out.println(Channel.class.getClassLoader());

	}
}
