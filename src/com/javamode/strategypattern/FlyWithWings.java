package com.javamode.strategypattern;

import com.javamode.util.Log;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		Log.d("I Can Fly With Wings !");
	}

}
