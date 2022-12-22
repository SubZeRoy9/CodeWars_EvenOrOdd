/* Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.*/

import java.util.Scanner;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		int input;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer to see if it is even or odd...");
		input = scan.nextInt();
		System.out.println(even_or_odd(input));
	}
	
    public static String even_or_odd(int number) {
       int check = number % 2;
      
       if (check == 0) {
    	   return "Even";
      }
      else { 
    	  return "Odd";
    }
   }
 }
