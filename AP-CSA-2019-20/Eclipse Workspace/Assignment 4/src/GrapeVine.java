import javax.swing.JOptionPane;

//Andrew Young
//Assignment 4
public class GrapeVine {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to GrapeVine!");
		String promptInputOne = JOptionPane.showInputDialog("Welcome to GrapeVine!\nEnter 1 for Pine,\nEnter 2 for Oak,\nEnter 4 for Mahogany,\nEnter 4 for Cedar,\nEnter 5 for Bocote,\nEnter 6 for Sandelwood.");
        int woodType = Integer.parseInt(promptInputOne);
        //defining vars
        int cost = 0;
        int finishType = 0;
        String woodName = "";
        String finishName = "";
        String eek = " ";
        //if statements
        if (woodType == 1) {
        	//pine
        	woodName = "Pine ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished pine
    			cost = 100 + 285;
    		} else {
    			//unfinished or other input
    			cost = 100;
    		}
        } else if (woodType == 2) {
        	//oak
        	woodName = "Oak ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished oak
    			cost = 225 + 285;
    		} else {
    			//unfinished or other input
    			cost = 225;
    		}
        } else if (woodType == 3) {
        	//mahogany
        	woodName = "Mahogany ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished mahogany
    			cost = 1210 + 285;
    		} else {
    			//unfinished or other input
    			cost = 1210;
    		}
        } else if (woodType == 4) {
        	//cedar
        	woodName = "Cedar ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished cedar
    			cost = 975 + 285;
    		} else {
    			//unfinished or other input
    			cost = 975;
    		}
        } else if (woodType == 5) {
        	//bocote
        	woodName = "Bocote ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished bocote
    			cost = 6975 + 285;
    		} else {
    			//unfinished or other input
    			cost = 6975;
    		}
        } else if (woodType == 6) {
        	//sandelwood
        	woodName = "Sandelwood ";
    		String promptInputTwo = JOptionPane.showInputDialog("Chose a Finish:\nEnter 1 for Finished Table,\nEnter 2 for Unfinished Table (No Sealant).");
    		finishType = Integer.parseInt(promptInputTwo);
    		//^^ converts input string to integer
    		if (finishType == 1) {
    			//finished sandel
    			cost = 2600 + 285;
    		} else {
    			//unfinished or other input
    			cost = 2600;
    		}
        } else {
        	//invalid input one
        	JOptionPane.showMessageDialog(null, "Error, pick a number one through six"); 
        	eek = " not ";
        }
        //below converts int to string for cost
        String costStr = Integer.toString(cost);
        //below checks finish name
        if (finishType == 1) {
        	finishName = "Finished ";
        	        } else if (finishType == 2) {
        	finishName = "Unfinished ";
        }
        JOptionPane.showMessageDialog(null, "You are" + eek + "buying a " + finishName + woodName + "table.\nCost: $" + costStr);
        
	}

}
