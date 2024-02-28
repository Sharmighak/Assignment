package swap;

public class Question {
	
	public static void Grade(int mark)
	{
		if(mark>=90)
		{
			System.out.println("A grade");
		}
		else if(mark>=50 && mark<=89)
		{
			System.out.println("B grade");
		}
		else
		{
			System.out.println("Fail");
		}

	}

	public static void main(String[] args) {
		Question obj=new Question();
		int sharmi=100;
		int nandhu=40;
		int sangavi=80;
		obj.Grade(sharmi);
		obj.Grade(nandhu);
        obj. Grade(sangavi);

		

	}
	
}
