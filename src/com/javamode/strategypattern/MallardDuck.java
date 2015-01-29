package com.javamode.strategypattern;

import com.javamode.util.Log;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		m_fly = new FlyWithWings();
		m_quack = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Log.d("I am a really Mallard Duck!");
	}

}
