public class overloading3
{

	public static void main(String[] args) 
	{
		calcFeetAndInchesToCm(6, 0);
		calcFeetAndInchesToCm(7, 5);
		calcFeetAndInchesToCm(-10, 5);
		calcFeetAndInchesToCm(0, 5);
		calcFeetAndInchesToCm(6, -10);


		//calling the second method
		calcFeetAndInchesToCm(100);
		calcFeetAndInchesToCm(157);
		calcFeetAndInchesToCm(-10);
	}

	public static double calcFeetAndInchesToCm(double feet, double inches) 
	{
		if ((feet < 0) || ((inches < 0) || (inches > 12))) 
		{
			System.out.println("Invalid feet or inches parameters");
			return -1;	
		}


		double centimeters = (feet * 12) * 2.54;
		centimeters = centimeters + (inches * 2.54);
		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
		return centimeters;
	}


	public static double calcFeetAndInchesToCm(double inches) 
	{
		if (inches < 0) 
		{
			System.out.println("Invalid inches parameters");
			return -1;	
		}

		double feet = (int) inches / 12;
		double remainingInches = (int) inches % 12;
		System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
		return calcFeetAndInchesToCm(feet, remainingInches);
	}


}