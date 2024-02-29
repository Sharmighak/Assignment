package swap;

public class Factorial {
	
	 static int num=5;
	 static int fact=1;

	public static void main(String[] args) {
		
		for (int i = num; i >= 1; i--) {
			
			fact=fact*i;
			
			
		}
		System.out.println(fact);

	}

}
