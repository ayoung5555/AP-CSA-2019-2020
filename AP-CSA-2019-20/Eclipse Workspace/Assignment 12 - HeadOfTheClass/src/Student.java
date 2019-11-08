//Andrew Young
//Assignment 12
//6-6-19 HeadOfTheClass


import java.util.Random;

public class Student {
	//rivate vars
	private String name;
	private int totalScore;
	private double averageScore;
	private int numOfQuizzes;
	
	public void setName(String thename) {
		name = thename;
	}
	
	public Student() { //default constructor
		name = "John Smith";
		totalScore = 0;
		averageScore = 0;
		numOfQuizzes = 0;
	}
	
	public Student(String thename) { //constructor for valid inputs
		name = thename;
		totalScore = 0;
		averageScore = 0;
		numOfQuizzes = 0;
	}
	
	
	public void setQuizScores(int theNumberOfQuizzes) { //loops through # of quizzes
		numOfQuizzes = theNumberOfQuizzes;
		Random rand = new Random();
		for(int i = 0; i < numOfQuizzes; i++) {
			int quizScore = rand.nextInt(101);
			totalScore += quizScore;
		}
		
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public double getAverageScore() {
		averageScore =  totalScore /  numOfQuizzes; //mean of scores
		return averageScore;
	}
	
	public String getName() {
		return name;
	}
	
}
