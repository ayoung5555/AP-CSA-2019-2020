//Andrew Young
//5/20/19
//Assignment 8.5
//This will return information about a string

public class studentStringInfo {
	private int vowel, word, character;
	//removed sentence bc not used

	public studentStringInfo() {
		vowel = 0;
		word = 0; //initialize vars
		character = 0;
		

	}

	// This will count the vowels.
	public int returnVowels(String s) {
		vowel = 0; //resets count
		String news = s.replace(" ", "").toLowerCase(); //removes space
		int lengthOfStr = news.length(); //length of input
		for(int i = lengthOfStr; i > 0; i--) {
			String char1 = news.substring(i - 1, i); //reverse order 
			if (char1.equals("a")) {
				vowel += 1;
			} else if (char1.equals("y")) {
				vowel += 1;
			} else if (char1.equals("e")) { //each of these adds vowel if an index has one
				vowel += 1;
			} else if (char1.equals("i")) {
				vowel += 1;
			} else if (char1.equals("o")) {
				vowel += 1;
			} else if (char1.equals("u")) {
				vowel += 1;
			}
		}
		
		return vowel;
	}

	// Find the words 
	public int returnWords(String y) {
		String[] news = y.split(" "); //split by space
		word = news.length; //total nums in array
		
		return word;
	}

	// Find the characters 
	public int returnCharacters(String x) {
		String news = x.replace(" ", ""); //removes space
		character = news.length(); //length without spaces

		return character;
	}
}
