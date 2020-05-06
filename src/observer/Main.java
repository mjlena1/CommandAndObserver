package observer;

public class Main {

	public static void main(String[] args) {
		TrPerson trperson = new TrPerson();
		Instructor instructor = new Instructor(trperson);
		IObserver viewer1 = new Viewer();
		IObserver viewer2 = new Viewer();
		IObserver viewer3 = new Viewer();
		
		trperson.subscribe(viewer1);
		trperson.subscribe(viewer2);
		trperson.subscribe(viewer3);
		
		instructor.ChangeTraining("Get up");
		System.out.println();
		instructor.ChangeTraining("Lie Down");

}
}
