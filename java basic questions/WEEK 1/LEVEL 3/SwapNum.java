import java.util.Scanner;
class SwapNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the two numbers :");
		int a=input.nextInt(),b=input.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The swapped numbers are "+a+" and "+b);
	}
}