package com.design.mode.composite;
//组合中的对象声明接口，在适当情况下，实现所有类公有接口的默认行为。声明一个接口用于访问和管理Component的子部件
public abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public abstract void Add(Component c);

	public abstract void Remove(Component c);

	public abstract void Display(int depth);
}
