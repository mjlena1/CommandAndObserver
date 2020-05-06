package command;

public class LieDown implements Command {
	
private TrPerson trperson;
	
	public LieDown(TrPerson trperson) {
		this.trperson = trperson;
	}
	
	@Override
	public void execute() {
		trperson.setTraining("Lie Down");
	}

}
