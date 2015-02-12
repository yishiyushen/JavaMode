package com.javamode.observerpattern;
/**
 * 观察者实体类气象布告板，研发人员可以实现观察者和显示接口来实现自己的布告板
 * @author zhonglh
 *
 */
public class ThirdPartyDisplay implements IDisplayElement, IObserver {

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}
