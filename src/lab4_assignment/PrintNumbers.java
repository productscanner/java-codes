/*
 * 2. Write for loop that prints the numbers from 1 to 100 and then print the
same numbers in the reverse order.*/

package lab4_assignment;

public class PrintNumbers {

	public static void main(String[] args) {
		int i;
		for( i=1; i<=100;i++){
			System.out.println(i);
		}
		System.out.println("Printing numbers in reverse order");
		for(i=100; i>0; --i){
			System.out.println(i);
		}

	}

}
