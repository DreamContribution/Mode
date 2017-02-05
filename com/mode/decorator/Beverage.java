package com.mode.decorator;

//饮料类，所有的饮料必须直接继承该类型
public abstract class Beverage {
	String description = "Unknow Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
