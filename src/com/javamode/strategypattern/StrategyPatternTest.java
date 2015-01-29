package com.javamode.strategypattern;
/**
 * 策略模式：定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户端。
 * OO基础:
 * 		抽象、封装、继承、多态
 * OO原则：
 * 		1、封装变化，2、多用组合，少于继承，3、针对接口编程，不针对实现编程
 * @author zhonglh
 *
 */
public class StrategyPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();
		
		duck.setM_fly(new FlyNoWay());
		duck.setM_quack(new Squack());
		duck.performFly();
		duck.performQuack();
	}

}
