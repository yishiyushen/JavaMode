package com.javamode.observerpattern;

import java.util.ArrayList;

/**
 * 真实主题，一个天气气象站
 * @author zhonglh
 *
 */
public class WeatherData implements ISubject {

	private ArrayList<IObserver> m_observers;
	private float m_temprature;
	private float m_humidity;
	private float m_pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		m_observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void registerObserver(IObserver o) {
		// TODO Auto-generated method stub
		if(o == null){
			return;
		}
		
		m_observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		// TODO Auto-generated method stub
		if(o == null){
			return;
		}
		int index = m_observers.indexOf(o);
		if(index >= 0){
			m_observers.remove(o);
		}

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(IObserver o:m_observers){
			o.update(m_temprature, m_humidity, m_pressure);
		}
	}
	
	public float getTemperature(){
		return 0.f;
	}
	
	public float getHuimmdity(){
		return 0.0f;
	}
	
	public float getPressure(){
		return 0.0f;
	}
	
	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.m_temprature=temp;
		m_humidity = humidity;
		m_pressure = pressure;
		measurementsChanged();
	}

}
