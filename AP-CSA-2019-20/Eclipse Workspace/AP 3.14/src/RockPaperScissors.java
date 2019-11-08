//Andrew Young
//3.14

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean cont = true;
        System.out.println("Welcome to Rock Paper Scissors!");
        while (cont == true) 
        {
        System.out.println("");
        System.out.println("Make a selection:");
        System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Exit");
        // 1. Rock
        // 2. Paper
        // 3. Scissors
        // 4. Exit
        Scanner input = new Scanner(System.in);
        int prompt = input.nextInt();
        if (prompt == 4)
        {
            cont = false;
        }
        else if (prompt != 1 && prompt != 2 && prompt != 3)
        {
            System.out.println("Error. Please enter the number '1', '2', or '3' next time.");
        }
        
        if (cont == true)
        {
        //This part gets computer random
        Random rand = new Random();
        int cpuPlay = rand.nextInt(3) + 1;
        //Checks results
        if (prompt == 1 & cpuPlay == 1){
            //rock tie
            System.out.println("CPU played Rock, Tie.");
        }
        else if (prompt == 1 & cpuPlay == 2){
            //cpu win
            System.out.println("CPU played Paper, CPU wins.");
        } 
        else if (prompt == 1 & cpuPlay == 3){
            //user win
            System.out.println("CPU played Scissors, you win.");
        }
        else if (prompt == 2 & cpuPlay == 1){
            //user win
            System.out.println("CPU played Rock, you win.");
        }
        else if (prompt == 2 & cpuPlay == 2){
            //paper tie
            System.out.println("CPU played Paper, Tie.");
        }
        else if (prompt == 2 & cpuPlay == 3){
            //cpu win
            System.out.println("CPU played Scissors, CPU wins.");
        }
        else if (prompt == 3 & cpuPlay == 1){
            //cpu win
            System.out.println("CPU played Rock, CPU wins.");
        }
        else if (prompt == 3 & cpuPlay == 2){
            //user win
            System.out.println("CPU played Paper, you win.");
        }
        else if (prompt == 3 & cpuPlay == 3){
            //scissors tie
            System.out.println("CPU played scissors, Tie.");
        } 
        else
        {
            System.out.println("");
        }
        }
        if (cont == false) 
        {
            input.close();
        }
        }
    }
}
