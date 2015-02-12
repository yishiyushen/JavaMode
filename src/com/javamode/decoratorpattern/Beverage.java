package com.javamode.decoratorpattern;
/**
 * 饮料抽象类
 * @author zhonglh
 *
 */
public abstract class Beverage {
	public static final int SMALL= 0;
	public static final int MID = 1;
	public static final int BIG = 2;
	protected int type = SMALL;
	protected String describe;
	
	public String getDescription(){
		return describe;
	}
	
	public String getTypeDescription(){
		String detail=null ;
		switch(type){
		case SMALL:
			detail = "小杯";
			break;
		case MID:
			detail = "中杯";
			break;
		case BIG:
			detail = "大杯";
			break;
		}
		return detail;
	}
	
	public abstract double cost();
}
