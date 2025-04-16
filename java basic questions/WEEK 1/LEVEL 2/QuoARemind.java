import java.util.Scanner;
class QuoARemind{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter first number :");
		int num1=input.nextInt();
		System.out.print("enter second number :");
		int num2=input.nextInt();
		
		int quotient=num1/num2;
		int remainder=num1%num2;
		
		System.out.println("The quotient is "+quotient+" and the remainder is "+remainder+" of the two numbers "+num1+" and "+num2);
	}
}
		 