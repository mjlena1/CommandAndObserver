package command;

public class Main {
	
	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		TrPerson trperson = new TrPerson();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trperson.subscribe(viewer1);
		trperson.subscribe(viewer2);
		trperson.subscribe(viewer3);
		
		Command changeTrainingToLieDown = new LieDown(trperson);
		Command changeTrainingToGetUp = new GetUp(trperson);
		
		instructor.setCommand(changeTrainingToLieDown);
		instructor.ChangeTraining();
		
		instructor.setCommand(changeTrainingToGetUp);
		instructor.ChangeTraining();


}
	
}
