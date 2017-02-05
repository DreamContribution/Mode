package com.mode.decorator;

//对外的描述类，所有需要对核心类型拓展描述的类均必须直接集成该类型
public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();
	
}
