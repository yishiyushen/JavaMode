package com.javamode.observerpattern;

import com.javamode.util.Log;

/**
 * 观察者实体类气象布告板，此类布告板用于更具天气气象站WeatherData对象显示当前观测值
 * @author zhonglh
 *
 */
public class CurrentConditionDisplay implements IObserver, IDisplayElement {

	private float m_temprature;
	private float m_humidity;
	private float m_pressure;
	private ISubject m_subject;
	public CurrentConditionDisplay(ISubject subject) {
		// TODO Auto-generated constructor stub
		m_subject = subject;
		m_subject.registerObserver(this);
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Log.d("Current conditions: "+m_temprature+"F degrees and "+m_humidity+" % humidity");
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
