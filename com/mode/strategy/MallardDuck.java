package com.mode.strategy;

import com.mode.strategy.behaviorImp.FlyWithWings;
import com.mode.strategy.behaviorImp.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
