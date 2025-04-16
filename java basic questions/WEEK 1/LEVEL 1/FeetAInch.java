import java.util.Scanner;
class FeetAInch{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter your height in cm:");
		double height=input.nextDouble();
		
		double inch=height*2.54;
		double foot=inch*12;
		
		System.out.println("Your height in cm is "+height+" while in feet is "+foot+" and inches is "+inch);
	}
}