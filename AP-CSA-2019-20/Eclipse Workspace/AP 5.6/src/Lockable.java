
public interface Lockable {

	public void flip();
	public boolean isHeads();
	public String toString();
	public void setKey(int theKey);
	public void lock(int theKey);
	public void unlock(int theKey);
	public boolean isLocked();
	
}
