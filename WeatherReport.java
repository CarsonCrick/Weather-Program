// Carson Crick

//Wheather Report Program

//8-21-17


import java.util.Scanner; //imports the text scanner

public class WeatherReport 
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in); 
		
		System.out.println("Please enter your temperature in degrees F");  // Prints out the text in parentheses
		
		int temperature = cin.nextInt();  //Identifying the temperature variable

		int answer = temperature;  //Identifying the answer variable
			
		{
			answer = (((temperature - 32)*5)/9); //Plugs in the user entered temperature into a math equation and outputs an answer
		}
		
		System.out.println("Your temperature is " + answer + " centigrade"); //Prints out the answer to the user
		
		if(temperature < 32) //If the temperature variable is less than 32
		{
			System.out.println("It is cold today"); //If it is print out the text in the parentheses to the user
		}
		
		if(temperature > 90)  //If the temperature is above 90
		{
			System.out.println("It is hot today");  //If it is above then print out the text in the parentheses
		}
		
		if(temperature > 32 && temperature < 90)  //If the temperature is above 32 and less than 90 
		{
			System.out.println("The temperature today is neither hot or cold");  //If it is above then print out the text in the parentheses
		}
		
	}
	

}
