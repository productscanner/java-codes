/*
 3. Write a program that reads ten integers and displays them in the reverse of
the order in which they were read.*/
package lab4_assignment;
import java.util.Scanner;

public class IntegerReader {

	public static void main(String[] args) {
		int [] numbers = new int[10];
		Scanner numberReader = new Scanner(System.in);
		System.out.println("Enter ten integers");
		int i=0;
		do{
			numbers[i] = numberReader.nextInt();
			 
			i++;
		}while( i<10);
		i--;
		while(i>=0){
			System.out.println(numbers[i]);
			--i;
		}

	}

}
