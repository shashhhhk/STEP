import java.util.Scanner;
class SumNaturalNum{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a positive integer :");
		int n=input.nextInt();
		if(n>0){
			int sum=(n*(n+1))/2;
			System.out.println("the sum of "+n+" natural numbers is "+sum);
		}
		else if(n<=0) System.out.println("the number "+n+" is not a natural number ");
	}
}
		