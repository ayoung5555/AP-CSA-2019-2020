
public interface Priority {
	   int MAX_PRIORITY = 10;
	   int MED_PRIORITY = 5;
	   int MIN_PRIORITY = 1;
	   
	   public void setPriorityLevel(int thePriority);
	   public int getPriorityLevel();
	   public void setTask(String theTask);
	   public String getTask();
}
