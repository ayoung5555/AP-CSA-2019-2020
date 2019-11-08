
public class PigRunner {

	public int playerNumRolls, compNumRolls, playerCurrRoll, compCurrRoll;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pig oink = new Pig();
		System.out.println(oink.PlayerTurn());
		oink.ComputerTurn();
	}

}
