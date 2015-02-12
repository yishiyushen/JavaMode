package com.javamode.decoratorpattern;
/**
 * 摩卡 ，装饰者类
 * @author zhonglh
 *
 */
public class Mocha extends CondimentDecorator {
	
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
		this.type = beverage.type;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double money = 0;
		switch(type){
		case SMALL:
			money = 0.2;
			break;
		case MID:
			money = 0.4;
			break;
		case BIG:
			money = 0.6;
			break;
		}
		return money+this.beverage.cost();
	}

}
