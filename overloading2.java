public class overloading2
{

	public static void main(String[] args) 
	{
		calcFeetAndInchesToCm(6, 0);
		calcFeetAndInchesToCm(7, 5);
		calcFeetAndInchesToCm(-10, 5);
		calcFeetAndInchesToCm(0, 5);
		calcFeetAndInchesToCm(6, -10);
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


}