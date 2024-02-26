package swap;

public class SwapTypes {
	
	
	
	public static void temp(int a,int b,int temp)
	{
		temp=a;
		a=b;
		b=temp;
		System.out.println("*************temporary variable*************");
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		
		
	}
	public static void withouttemp(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("************Arithmetic operation*************");
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);

	}
	public static void logical(int a,int b)
	{
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("*************XOR gate*************");
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
	}
	
	

	public static void main(String[] args) {
		int temp=0;
		int a=100;
		int b=50;
		
        temp(a,b,temp);
        withouttemp(a,b);
        logical(a,b);
	}

}
