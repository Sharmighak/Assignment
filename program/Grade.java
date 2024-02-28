
package swap;

import java.util.*;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark");
		int mark=sc.nextInt();
		
		
		if(mark >= 90)
		{
			System.out.println("A grade");
		}
		
		else if (mark >= 50 && mark <= 89) 
		{
			System.out.println("B grade");
			
		} 
		else if (mark >= 35 && mark <= 49) 
		{
			System.out.println("c grade");
			
		} 
		else
		{
			System.out.println("Fail");

		}
		
		
	}

}
