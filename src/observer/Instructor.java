package observer;

public class Instructor {
	
	TrPerson trperson;
	public Instructor(TrPerson trperson)
	
	{
		this.trperson = trperson;
	}
	
	public void ChangeTraining(String newTraining)
	{
		this.trperson.setTraining(newTraining);
	}

}
