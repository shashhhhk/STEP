import java.util.Scanner;
class CelToFar{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter temperatur in celcius :");
		double celcius=input.nextDouble();
		
		double fahrenheit=(celcius*9/5)+32;
		
		System.out.println("the "+celcius+" is "+fahrenheit+" fahrenheit");
	}
}
	