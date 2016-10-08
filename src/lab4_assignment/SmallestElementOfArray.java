/*
 * 6. Write a method that returns the index of the smallest element in the array
of integers. If the number of such elements is greater than 1, return the
smallest index, use the following header:
*/

package lab4_assignment;

public class SmallestElementOfArray {

	public static void main(String[] args) {
		int [] numbers = {7,-3,7,-3,8,6};
		int smallestIndex = 0;
		int smallestNumber;
		
		smallestNumber = numbers[0];	
		
			for(int i=1; i< numbers.length; i++){
				if(smallestNumber > numbers[i]){
					smallestNumber = numbers[i];
					smallestIndex = i;
				}
			}
		System.out.println(" Index of the smallest integer in the array is : "+smallestIndex);
	}

}
