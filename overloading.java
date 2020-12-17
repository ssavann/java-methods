public class overloading
{
	public static void main(String[] args) 
	{
		int newScore = calculateScore("Toto", 500);
		System.out.println("New Score is " + newScore);

		calculateScore(75);	//by using the same Method name, but second method

		calculateScore(); 	//by using the same Method name, but third method
	}

	public static int calculateScore(String playerName, int score) 
	{
		System.out.println("PLayer " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	//second method, but same name, different arguments
	public static int calculateScore(int score) 
	{
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	//third method, but same name, different arguments
	public static int calculateScore() 
	{
		System.out.println("No player name, no player score. ");
		return 0;
	}

}