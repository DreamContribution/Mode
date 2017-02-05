package com.mode.strategy.behaviorImp;

import com.mode.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
