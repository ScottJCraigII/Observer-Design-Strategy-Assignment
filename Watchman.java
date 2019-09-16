package csce247.assignments.observer;

import java.util.ArrayList;

public class Watchman implements Subject {
	
	private ArrayList<Observer> observers;  //stores all observers link to this subject 
	private int warning=0;					//variable that sets observer behavior
	
	public Watchman(){						//default constructor
		observers = new ArrayList<Observer>();	//each watchman gets their own set of observers.
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) { //loops through observer array then pushes update with watchmans alert status
			observer.update(warning);
		}
	}
	
	public void issueWarning(int warning){	//when driver sets a new warning
		this.warning = warning;				//sets watchmans alert status
		this.display(warning);				//outputs based on alert status	
		this.notifyObservers();				//pushes alert staus to observers
		
	}
	public void display(int warning){	
		if (warning == 1 ){
			System.out.println("WARNING: " + warning + " trumpet was played!");
		}else{
			System.out.println("WARNING: " + warning + " trumpets were played!");
		}
	}
}