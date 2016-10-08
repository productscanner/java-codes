/*
 4. Convert the following for loop statement to a while loop and to a do-while
loop:
 long sum = 0;
 for (int i = 0; i <= 1000; i++)
 sum = sum + i;*/
package lab4_assignment;

public class LoopConverter {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		while(i<=1000){
			sum = sum + i;
			i++;
		}
		System.out.println("sum after while loop :: "+sum);
		i = 0;
		sum = 0;
		do{
			sum = sum +i;
			i++;
		}while(i<=1000);
		
		System.out.println("sum after do-while loop :: "+sum);

	}

}
