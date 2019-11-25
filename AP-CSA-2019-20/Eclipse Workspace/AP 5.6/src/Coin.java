
//********************************************************************
//  Coin.java       Author: Lewis/Loftus/Cocking
//
//  Represents a coin with two sides that can be flipped.
//
//  Modified by: Andrew Youg
//
//********************************************************************
public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private int face;
   private int key;
   private int lock = 0; // 0 is locked, 1 in unlocked
   
   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Coin ()
   {
      flip();
   }
   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }
   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }
   
   //-----------------------------------------------------------------
   //  Sets the key variable to the input
   //-----------------------------------------------------------------
   public void setKey(int theKey)
   {
	   key = theKey;
   }
   
   //-----------------------------------------------------------------
   //  Sets the object to locked
   //-----------------------------------------------------------------
   public void lock(int theKey)
   {
	   if (this.isLocked() == false && key == theKey)
	   {
		   lock = 0;
	   }
   }
      
   //-----------------------------------------------------------------
   //  Sets the object to unlocked
   //-----------------------------------------------------------------
   public void unlock(int theKey)
   {
	   if (this.isLocked() == true && key == theKey)
	   {
		   lock = 1;
	   }
   }
   
   //-----------------------------------------------------------------
   //  Returns the current locked status of the object.
   //-----------------------------------------------------------------
   public boolean isLocked() {
	   if (lock == 0)
		   return true;
	   else 
		   return false;
   }
   
   
   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;
      if (this.isLocked()) 
      {
    	  faceName = "Locked";
      }
      else if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
      return faceName;
   }
  }