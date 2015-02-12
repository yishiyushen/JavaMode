package com.javamode.observerpattern;

import com.javamode.util.Log;

/**
 * 观察者实体类气象布告板，此类布告板更具天气气压计显示天气预报
 * @author zhonglh
 *
 */
public class ForecastDisplay implements IDisplayElement, IObserver {

	private float m_temprature;
	private float m_humidity;
	private float m_pressure;
	private ISubject m_subject;
	public ForecastDisplay(ISubject subject) {
		// TODO Auto-generated constructor stub
		m_subject = subject;
		m_subject.registerObserver(this);
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		Log.d("ForecastDisplay conditions: "+m_temprature+"F degrees and "+m_humidity+" % humidity");
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
