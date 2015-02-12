package com.javamode.decoratorpattern;
/**
 * 浓缩咖啡类
 * @author zhonglh
 *
 */
public class Espresso extends Beverage {
	
	public Espresso(int type) {
		// TODO Auto-generated constructor stub
		this.type = type;
		describe = getTypeDescription()+"Espresso";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double money = 0;
		switch(type){
		case SMALL:
			money = 1.49;
			break;
		case MID:
			money = 1.99;
			break;
		case BIG:
			money = 2.49;
			break;
		}
		return money;
	}

}
