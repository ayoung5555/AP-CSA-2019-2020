
public class Task implements Priority {
	int priority;
	String taskName;
	
	public void setPriorityLevel (int thePriority) 
	{
		priority = thePriority;
	}
	
	public int getPriorityLevel () {
		return priority;
	}
	
	public void setTask (String theTask)
	{
		taskName = theTask;
	}
	
	public String getTask ()
	{
		return taskName;
	}
}
