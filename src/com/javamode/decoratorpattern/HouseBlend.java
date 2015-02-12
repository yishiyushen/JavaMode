package com.javamode.decoratorpattern;

public class HouseBlend extends Beverage {

	public HouseBlend(int type) {
		// TODO Auto-generated constructor stub
		this.type = type;
		describe = getTypeDescription()+"House Blend Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double money = 0;
		switch(type){
		case SMALL:
			money = 0.89;
			break;
		case MID:
			money = 1.89;
			break;
		case BIG:
			money = 2.89;
			break;
		}
		return money;
	}
}
