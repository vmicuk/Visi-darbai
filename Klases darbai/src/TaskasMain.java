
public class TaskasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Taskas task = new Taskas();
		task.setX(5);
		task.setY(4);
		System.out.println(task.atstumas());
		
		
		//Taskas task2 = new Taskas(5.1, 4.6);
		//System.out.println(task2.atstumas());
		
		Taskas task3 = new Taskas(5.2, 1.9, 4.5);
		System.out.println(task3.atstumasTrisTaskai());
		
	}

}
