/*
 * 2. Write a method with the following header to display three numbers in
increasing order:
public static void displaySortedNumbers(double num1, double num2,
double num3);
Write a test program that prompts the user to enter three numbers and
invokes the method to display them in increasing order.
*/

package lab5_assignment;

import java.util.Scanner;

public class SortedNumbers {

	public static void main(String[] args) {
		testDisplaySortedNumbers();
	}
	
	public static void testDisplaySortedNumbers(){
		System.out.println("Enter three numbes");
		Scanner readNums = new Scanner(System.in);
		double num1, num2, num3;
		num1 = readNums.nextDouble();
		num2 = readNums.nextDouble();
		num3 = readNums.nextDouble();
		displaySortedNumbers(num1, num2, num3);
		
		
		//readNums.close();
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3){
		//System.out.println(num1 +" "+num2+" "+num3);
				
		if(num1 > num2){
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		
		if(num2 > num3){
			num2 = num2 + num3;
			num3 = num2 - num3;
			num2 = num2 - num3;
		}
		
		if(num1 > num2){
			num1 = num1 + num2;
			num2 = num1 - num2;
			num1 = num1 - num2;
		}
		
		System.out.println("Entered numbers in increasing order :: "+num1+"  "+num2+"  "+num3);
	}

}
