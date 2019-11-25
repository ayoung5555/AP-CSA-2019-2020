
public class TaskDriver { 
	
	public static void main(String[] args) {
		
		Task task1 = new Task(); //creates task1 object
		task1.setTask("Do homework"); //names task1 option
		System.out.println("Task Name: " + task1.getTask()); //returns it to console
		
		Task task2 = new Task();
		task2.setPriorityLevel(10); //sets priority for task2
		System.out.println("Priority: " + task2.getPriorityLevel()); //returns it to console
		
		Task task3 = new Task(); //does both
		task3.setPriorityLevel(3);
		task3.setTask("Do dishes");
		System.out.println("Task Name: " + task3.getTask() + "\n" + "Priority: " + task3.getPriorityLevel());
		

	}

}
