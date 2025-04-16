import java.util.Scanner;
class UnitConverterThree{
	public static double FahrenToCel(double x){
		return ((x - 32) * 5 / 9);
	}
	public static double CelToFahren(double x){
		return (x * 9 / 5) + 32;
	}
	public static double KgToPound(double x){
		return x*2.20462; 
	}
	public static double PoundToKg(double x){
		return x*0.453592;
	}
	public static double GalToLit(double x){
		return x*3.78541;
	}
	public static double LitToGal(double x){
		return x*0.264172;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		double num=input.nextDouble();
		double a=FahrenToCel(num),b=CelToFahren(num),c=PoundToKg(num),d=KgToPound(num),e=GalToLit(num),f=LitToGal(num);
		System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f);
	}
}


