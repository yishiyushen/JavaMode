package com.javamode.decoratorpattern;

import com.javamode.util.Log;

/**
 * 装饰者模式：动态的将责任附近到对象上。若要扩展功能，装饰着比继承更有弹性的替代方案
 * OO原则:对扩展开发，对修改关闭
 * @author zhonglh
 *
 */
public class DecoratorPatternTest {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso(Beverage.BIG);
		Log.d(beverage.getDescription());
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		Log.d(beverage.getDescription()+"  价格:"+beverage.cost());
	}
}
