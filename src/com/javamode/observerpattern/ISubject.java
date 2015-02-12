package com.javamode.observerpattern;
/**
 * 主题要实现的主题接口
 * @author zhonglh
 *
 */
public interface ISubject {
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObservers();
}
