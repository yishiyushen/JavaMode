package com.javamode.strategypattern;

import com.javamode.util.Log;

public class Squack implements IQuackBehavior {

	@Override
	public void quick() {
		// TODO Auto-generated method stub
		Log.d("实现橡皮鸭子吱吱叫！");
	}

}
