import java.util.Scanner;
class UnitConverter{
	public static double KmToMile(double x){
		double km2miles=0.621371;
		return x*km2miles;
	}
	public static double MileToKm(double x){
		double miles2km=1.60934;
		return x*miles2km;
	}
	public static double MeterToFeet(double x){
		double meters2feet=3.28084;
		return x*meters2feet;
	}
	public static double FeetToMeter(double x){
		double feet2meters=0.3048;
		return x*feet2meters;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		double num=input.nextDouble();
		double a=KmToMile(num),b=MileToKm(num),c=MeterToFeet(num),d=FeetToMeter(num);
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d);
	}
}


