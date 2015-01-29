package com.javamode.strategypattern;

import com.javamode.util.Log;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Log.d("I can not fly!");
	}

}
