package observer;

import java.util.ArrayList;
import java.util.List;

public class TrPerson implements IObservable{
	private List<IObserver> observers = new ArrayList<IObserver>();
	private String training;

	public void setTraining(String training) {
		this.training = training;
		this.notifyObservers();
	}
	
	@Override
	public void notifyObservers() {
		for(IObserver observer: this.observers) {
			observer.update();
		}
		
	}
	
	@Override
	public String getUpdate() {
		return training;
	}
	
	@Override
	public void subscribe(IObserver observer) {
		observer.setTrPerson(this);
		this.observers.add(observer);
		
	}

	@Override
	public void unsubscribe(IObserver observer) {
		this.observers.remove(observer);
	}
}


