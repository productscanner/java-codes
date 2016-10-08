/*1. Ask the user to guess your name. If the guess is correct display the message
saying guess is correct else display message saying guess is wrong and keep
on asking the user to guess the name until it is correct.*/

package lab4_assignment;

import java.util.Scanner;

public class NameGuesser {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		String nameGuessed, realName = "Henry";
		
		do{
		System.out.println("Please enter your name ");
		nameGuessed = user_input.next();
		}while(!nameGuessed.equals(realName));

		System.out.println("name Guessed :: "+nameGuessed);
		System.out.println("The name you entered is correct and you are magician!!!");
	}

}
