import java.util.Scanner;

public class TestCoin {

	public static void main(String[] args) {
		Coin quarter = new Coin();
		quarter.setKey(777);
		quarter.unlock(777);
		quarter.flip();
		System.out.println("Quarter: " + quarter.toString());
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a key: ");
		int userKey = input.nextInt();
		
		Coin dime = new Coin();
		dime.setKey(userKey);
		dime.flip();
		System.out.println("Dime: " + dime.toString());
		System.out.println("Enter your key to unlock.");
		int checkKey = input.nextInt();
		dime.unlock(checkKey);
		dime.flip();
		System.out.println("Dime: " + dime.toString());
		input.close();

	}

}
