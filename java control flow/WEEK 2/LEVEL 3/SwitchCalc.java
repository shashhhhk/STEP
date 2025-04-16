import java.util.Scanner;
class SwitchCalc{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the two numbers :");
		double f=input.nextDouble(),s=input.nextDouble();
		System.out.print("enter the operator(+,-,*,/) :");
		String op=input.next();
		switch(op){
			case "+":
			{System.out.println(f+s);
			break;}
			case "-":
			{System.out.println(f-s);
			break;}
			case "*":
			{System.out.println(f*s);
			break;}
			case "/":
			{System.out.println(f/s);
			break;}
			default:
			System.out.println("you have entered a wrong case ");
		}
	}
}	