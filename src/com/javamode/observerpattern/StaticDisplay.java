package com.javamode.observerpattern;

import com.javamode.util.Log;

/**
 * 观察者实体类气象布告板，此类布告板跟踪最小，平均，最大观测值并显示它们
 * @author zhonglh
 *
 */
public class StaticDisplay implements IDisplayElement, IObserver {

	private float m_temprature;
	private float m_humidity;
	private float m_pressure;
	private ISubject m_subject;
	public StaticDisplay(ISubject subject) {
		// TODO Auto-generated constructor stub
		m_subject = subject;
		m_subject.registerObserver(this);
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Log.d(" AVG/Max/Min temprature ="+m_temprature+"/"+m_humidity+" % humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.m_temprature=temp;
		m_humidity = humidity;
		m_pressure = pressure;
		display();
	}
}
