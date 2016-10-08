/*5. (Count positive and negative numbers and compute the average of
numbers) Write a program that reads an unspecified number of integers,
determines how many positive and negative values have been read, and
computes the total and average of the input values (not counting zeros).
Your program ends with the input 0. Display the average as a floating-point
number. Here is a sample run:
*/

package lab4_assignment;

import java.util.Scanner;

public class AverageCalculator {

	public static void main(String[] args) {
		int enteredNo;
		Scanner numberReader = new Scanner(System.in);
		System.out.println("Enter any number");
		int positiveNos=0, 
			negativeNos=0;
		float total = 0;
		float average = 0;
		
		do{
			
			enteredNo = numberReader.nextInt();
			
			if(enteredNo>0){
				positiveNos++;
			}
			else if(enteredNo < 0){
				negativeNos++;
			}
			total = total + enteredNo;
			
		}while( enteredNo != 0);
		
		average = total/(positiveNos+negativeNos);
		
		System.out.println("total positive numbers entered :: "+positiveNos);
		System.out.println("total negative numbers entered :: "+negativeNos);
		System.out.println("total sum :: "+total);
		System.out.println("average of all the numbers entered:: "+average);
	}

}
