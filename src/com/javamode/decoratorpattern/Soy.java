package com.javamode.decoratorpattern;
/**
 * 豆浆，装饰者
 * @author zhonglh
 *
 */
public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
		this.type = beverage.type;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double money = 0;
		switch(type){
		case SMALL:
			money = 0.15;
			break;
		case MID:
			money = 0.35;
			break;
		case BIG:
			money = 0.55;
			break;
		}
		return money+this.beverage.cost();
	}

}
