import java.util.Scanner;

//Andrew Young
//10-3-19
//AP 3.5
public class OneCharPerLine {

	public static void main(String[] args) {
		String strong;
		int length = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		strong = input.nextLine();
		length = strong.length();
		for (int i = 0; i < length; i++)
		{
			System.out.println(strong.charAt(i));
		}
		input.close();

	}

}
