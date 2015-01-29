package com.javamode.strategypattern;

public abstract class Duck {
	protected IFlyBehavior m_fly;
	protected IQuackBehavior m_quack;
	
	public void swiming(){
		System.out.println(" I Can Swimming !");
	}
	
	public void performFly(){
		m_fly.fly();
	}
	
	public void performQuack() {
		m_quack.quick();
	}
	
	
	
	public void setM_fly(IFlyBehavior m_fly) {
		this.m_fly = m_fly;
	}

	public void setM_quack(IQuackBehavior m_quack) {
		this.m_quack = m_quack;
	}

	public abstract void display();
}
