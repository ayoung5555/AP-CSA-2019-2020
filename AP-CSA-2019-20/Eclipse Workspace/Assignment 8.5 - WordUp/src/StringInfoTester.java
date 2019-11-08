
public class StringInfoTester {
public static void main (String [] args){
	studentStringInfo me = new studentStringInfo ();
	//Checking returnVowels: Expecting 11
	System.out.println(me.returnVowels("Woweymowe Sounds kinda funky."));

	//Checking returnWords: Expecting 15
	System.out.println(me.returnWords("How much wood could a wood chuck chuck if a wood chuck could chuck wood?"));
	
	//Checking returnCharacters: Expecting 20
	System.out.println(me.returnCharacters("taco taco taco taco taco"));
	
	//Checking the 6 possible vowels
	System.out.println(me.returnVowels("Aeiouy"));
}
}
