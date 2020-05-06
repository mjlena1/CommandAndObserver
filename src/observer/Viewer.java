package observer;

public class Viewer implements IObserver{
	private String training;
	private IObservable trperson;
	
	public Viewer() {
	}

	@Override
	public void update() {
		if(trperson == null) {
			System.out.println("No trPerson");
			return;
		}
		
		training = trperson.getUpdate();
		System.out.println("Viewer changed training to "+ this.training);
		
	}

	@Override
	public void setTrPerson(IObservable trperson) {
		this.trperson = trperson;
	}
	
	public String getTraining() {
		return this.training;
	}

	public void setTraining(String training) {
		this.training = training;
	}

	
	

}
