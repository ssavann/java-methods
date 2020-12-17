public class ifElse1
{

	public static void main(String[] args) 
	{
		int score = 6000;

		if (score >= 5000) 
		{
			System.out.println("Your score is above 5000");
		}
		else if (score < 1000 && score >= 5000) 
		{
			System.out.println("Your score was below 1000 but above 500");	
		}
		else
		{
			System.out.println("Your score was below 500");
		}


	}
}