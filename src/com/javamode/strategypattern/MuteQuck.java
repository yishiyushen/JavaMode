package com.javamode.strategypattern;

import com.javamode.util.Log;

public class MuteQuck implements IQuackBehavior {

	@Override
	public void quick() {
		// TODO Auto-generated method stub
		Log.d("什么都不做，不会叫！");
	}

}
