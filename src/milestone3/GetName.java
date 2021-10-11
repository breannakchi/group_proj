package milestone3;

import java.util.Scanner;



public class GetName 
{
	
	public static void main(String[] args)
	{
		Scanner user_input = new Scanner( System.in );
	
		String first_name;
	
	
		System.out.print("Enter your first name: ");
		first_name = user_input.next( );
		
		System.out.println("Your name is " +first_name);
	}


}
