package com.javamode.decoratorpattern;
/**
 * 调料抽象类，也就是装饰者类
 * @author zhonglh
 *
 */
public abstract class CondimentDecorator extends Beverage{
	protected Beverage beverage;
	public abstract String getDescription();
}
