package com.design.mode.adapter;

//这是客户所期待的接口。目标可以是具体的或抽象的类，也可以是接口
public class Target {
	public void Request() {
		System.out.println("普通请求!");
	}
}
