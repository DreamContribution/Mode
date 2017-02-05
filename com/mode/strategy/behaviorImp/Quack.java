package com.mode.strategy.behaviorImp;

import com.mode.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
