import java.util.Scanner;
class Chocolates{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter number of children :");
		int N=input.nextInt();
		System.out.print("enter number of chocolates :");
		int M=input.nextInt();
		
		int divide=N/M;
		int remain=N%M;
		System.out.println("The number of chocolates each child gets is "+divide+" and the number of remaining chocolates are "+remain);
	}
}