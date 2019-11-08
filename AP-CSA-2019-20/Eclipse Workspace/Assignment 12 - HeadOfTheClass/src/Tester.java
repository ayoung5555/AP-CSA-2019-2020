//Andrew Young
//Assignment 12
//HeadOfTheClass 6-6-19

public class Tester {

	public static void main(String[] args) {
		
		Student a = new Student();
		//----------------------------
		a.setQuizScores(5); //sets iterations for quiz scores
		a.setName("Andrew"); //sets student name
		System.out.println(a.getName()); //prints the returned name
		System.out.println(a.getAverageScore()); //prints the returned score avg
		System.out.println(a.getTotalScore()); //prints sum of scores
		//------------------
		Student b = new Student();
		b.setName("Benjamin");
		System.out.println(b.getName());
		b.setQuizScores(5);
		System.out.println(b.getAverageScore());
		System.out.println(b.getTotalScore());
		//-----------------------
		Student c = new Student("Charles");
		System.out.println(c.getName());
		c.setQuizScores(5);
		System.out.println(c.getAverageScore());
		System.out.println(c.getTotalScore());
		//----------------------
		Student d = new Student("Danny");
		System.out.println(d.getName());
		d.setQuizScores(5);
		System.out.println(d.getAverageScore());
		System.out.println(d.getTotalScore());
		
	}

}
