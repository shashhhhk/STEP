import java.util.Scanner;
class BMITable{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter weight(in kg) and height(in cm) :");
		double w=input.nextDouble(),h=input.nextDouble();
		double h_m=h/100;
		double BMI=w/(h_m*h_m);
		if(BMI>=40.0)System.out.print("you are obese ");
		else if(BMI>=25.0&&BMI<40)System.out.print("you are overweight");
		else if(BMI>=18.5&&BMI<25)System.out.print("you are normal ");
		else System.out.print("you are underwiehgt");
	}
}