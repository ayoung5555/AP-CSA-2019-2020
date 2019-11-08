/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses findKeyword to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		String checkString = statement.trim();
		if (checkString.equals("")) {
			System.out.println("Say something, please.");
		}
		else if (findKeyword(statement, "no ", 0) >= 0) //no should have space after it
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "uh oh", 0) >= 0) 
		{
			response = "Stinky";
		}
		else if (findKeyword(statement, "school", 0) >= 0) 
		{
			response = "Tell me more about your education.";
		}
		else if (findKeyword(statement, "mother", 0) >= 0
				|| findKeyword(statement, "father", 0) >= 0
				|| findKeyword(statement, "sister", 0) >= 0
				|| findKeyword(statement, "brother", 0) >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (findKeyword(statement, "song", 0) >= 0
				|| findKeyword(statement, "music", 0) >= 0)
		{
			response = "What are your music preferences?";
		}
		else if (findKeyword(statement, "cat", 0) >= 0
				|| findKeyword(statement, "dog", 0) >= 0)
		{
			response = "Tell me more about your pets";
		}
		else if (findKeyword(statement, "Mr.", 0) >= 0)
				
		{
			response = "He sounds like a good teacher";
		}
		else if (findKeyword(statement, "Mrs.", 0) >= 0
				|| findKeyword(statement, "Ms.", 0) >= 0
				|| findKeyword(statement, "Miss.", 0) >= 0)
		{
			response = "She sounds like a good teacher";
		}
		else if (findKeyword(statement, "I like", 0) >= 0)
		{
			String likeThing = statement.substring(7 + (findKeyword(statement, "I like", 0)));
			response = "What do you like about " + likeThing + "?";
		}
		else if (findKeyword(statement, "I want", 0) >= 0)
		{
			String wantThing = statement.substring(7 + (findKeyword(statement, "I want", 0)));
			response = "Would you really be happy if you had " + wantThing + "?";
		}
		else if (findKeyword(statement, "I", 0) >= 0 && findKeyword(statement, "you", 0) >= 3)
		{
			String loveThing = statement.substring(findKeyword(statement, "I ", 0) + 3, findKeyword(statement, "you", 0) - 1);
			response = "Why do you " + loveThing + " me?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Please continue.";
		}
		else if (whichResponse == 5)
		{
			response = "Wow! Who would've thought. I would've never believed that. That is so intersting.";
		}

		return response;
	}
	
	private int findKeyword(String statement, String goal, int startPos) {
	    String phrase = statement.trim();
	    int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
	    while (psn >= 0) {
	        String before = " ", after = " ";
	        if (psn > 0) {
	            before = phrase.substring(psn - 1, psn).toLowerCase();
	        }
	        if (psn + goal.length() < phrase.length()) {
	            after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
	        } /* determine the values of psn, before, and after at this point in the method. */
	        if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
	            return psn;
	        }
	        psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
	    }
	    return -1;
	}
}
