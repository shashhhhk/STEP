import java.util.Scanner;
class basiccalculator{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the first number :");
		int n1=input.nextDouble();
		
		System.out.print("enter the second number :");
		int n2=input.nextDouble();
		
		int add=n1+n2;
		int subtract=n1-n2;
		int multiply=n1*n2;
		double divide=n1/n2;
		
		System.out.println("The addition,subtraction,multiplication and division alues of 2 numbers"+n1+" and "+n2+" is "+add+","+subtract+","+multiply+" and "+divide);
	}
	
}
		