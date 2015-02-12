package com.javamode.observerpattern;
/**
 * 观察者模式：定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，
 * 		   它的所有依赖者都会收到通知并自动更新。
 * OO原则：
 * 		为了交互对象之间的松耦合设计而努力。
 * 观察者模式提供了让主题和观察者之间松耦合，松耦合的设计之所以能让我们建立有
 * 弹性的OO系统，能够应对变化，是因为对象之间的互相依赖性降到最低。
 * 
 * @author zhonglh
 *
 */
public class ObserverPatternTest {
	public static void main(String[] args) {
		WeatherData subject= new WeatherData();
		CurrentConditionDisplay cd = new CurrentConditionDisplay(subject);
		StaticDisplay sd = new StaticDisplay(subject);
		ForecastDisplay fd = new ForecastDisplay(subject);
		
		subject.setMeasurements(80.0f, 60.0f, 30.4f);
		subject.setMeasurements(82.0f, 65.0f, 35.4f);
		subject.setMeasurements(83.0f, 50.0f, 32.4f);
	}
}
