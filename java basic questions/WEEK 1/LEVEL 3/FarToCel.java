import java.util.Scanner;
class FarToCel{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter temperatur in fahrenheit :");
		double fahrenheit=input.nextDouble();
		
		double celcius=(fahrenheit-32)*5/9;
		
		System.out.println("the "+fahrenheit+" is "+celcius+" celcius");
	}
}