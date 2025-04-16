import java.util.Scanner;
class UnitConverterTwo{
	public static double YardToFeet(double x){
		return x*3;
	}
	public static double FeetToYard(double x){
		return x*0.333333;
	}
	public static double MetToInch(double x){
		return x*39.3701; 
	}
	public static double InchToMet(double x){
		return x*0.0254;
	}
	public static double InchToCm(double x){
		return x*2.54;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		double num=input.nextDouble();
		double a=YardToFeet(num),b=FeetToYard(num),c=MetToInch(num),d=InchToMet(num),e=InchToCm(num);
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e);
	}
}


