/*
 * 3. Write a method that prints characters using the following header:
 public static void printChars(char ch1, char ch2, int numberPerLine)
 This method prints the characters between ch1 and ch2 with the specified
 numbers per line. Write a test program that prints ten characters per line
 from A to Z. Characters are separated by exactly one space.
*/

package lab5_assignment;

public class ChracterPrint {

	public static void main(String[] args) {
		testPrintChars();
	}
	
	public static void testPrintChars(){
		printChars('A','Z', 10);
	}
	public static void printChars(char ch1, char ch2, int numberPerLine){
		int i = 0;
		for(char c = ch1; c <= ch2; c++ ){
			System.out.print(c+" ");
			i++;
			if(i == numberPerLine){
				System.out.println();
				i = 0;
			}
			
		}
	}

}
