package com.javamode.observerpattern;
/**
 * 观察者要实现的观察者接口
 * @author zhonglh
 *
 */
public interface IObserver {
	public void update(float temp, float humidity, float pressure);
}
