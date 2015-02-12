package com.javamode.decoratorpattern;
/**
 * 奶泡，装饰者类
 * @author zhonglh
 *
 */
public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage =beverage;
		this.type = beverage.type;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+",Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double money = 0;
		switch(type){
		case SMALL:
			money = 0.1;
			break;
		case MID:
			money = 0.3;
			break;
		case BIG:
			money = 0.5;
			break;
		}
		return money+this.beverage.cost();
	}

}
