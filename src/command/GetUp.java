package command;

public class GetUp implements Command {
	private TrPerson trperson;
	
	public GetUp(TrPerson trperson) {
		this.trperson = trperson;
		
	}
	@Override
	public void execute() {
		trperson.setTraining("Get Up");
	}

}
