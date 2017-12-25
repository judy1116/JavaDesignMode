package com.design.mode.interpreter;

/*
 * 终结符表达式，实现与文法中的终结符相关联的解释操作，实现抽象表达式中所要求的接口，主要是一个interpret()方法。
 * 文法中每一个终结符都有一个具体终结表达式与之相对应。
 */
public class TerminalExpression extends AbstractExpression {

	@Override
	public void Interpret(Context context) {
		// TODO Auto-generated method stub
		System.out.println("终端解释器");

	}

}
