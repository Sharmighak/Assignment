package swap;

public class VariableLocGlobal {

	static int globalVaribale=10;
	
	public static int multiply(int x)
	{
		return x * globalVaribale;
	}
	
	public static void main(String[] args) {
		
		int localVariable=20;
		System.out.println(multiply(localVariable));

	}

}
