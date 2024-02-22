package program;

public class Car {
	public void Break()
	{
		System.out.println("break");
	}
	public void Accelator()
	{
		System.out.println("Accelator");
	}

	public static void main(String[] args) {
		Car obj=new Car();
		obj.Break();
		obj.Accelator();

	}

}
