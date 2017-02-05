package com.mode.strategy.behaviorImp;

import com.mode.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying");
	}

}
