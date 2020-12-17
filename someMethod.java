public class someMethod
{


	public static void main(String[] args) 
	{
		//the method is called
		calculateScore(true, 800, 5, 100);
		calculateScore(true, 10000, 8, 200);


	}


	//this is a method
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) 
	{
		if (gameOver) 
		{
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000; //same as finalScore = finalScore + 2000;
			System.out.println("Your final score was " + finalScore);	
		}	
	}
}