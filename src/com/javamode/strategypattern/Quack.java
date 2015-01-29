package com.javamode.strategypattern;

import com.javamode.util.Log;

public class Quack implements IQuackBehavior {

	@Override
	public void quick() {
		// TODO Auto-generated method stub
		Log.d("实现鸭子 咕咕叫!");
	}

}
