package com.om;

public class Car {

	public Car() {
		System.out.println("car  constructor....");
	}

	private IEngin eng;

	public void setEng(IEngin eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int start=eng.start();
		
		if(start>=1)
			System.out.println("Journey started.....");
		else
			System.out.println("Trouble shoot engin");
	}

}
