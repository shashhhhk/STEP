import java.util.Scanner;
class PrimeNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int n=input.nextInt(),count=0;
		for(int i=2;i<n;i++)if(n%i==0)count++;
		if(count!=0)System.out.print(n+" is not a Prime number");
		else System.out.println(n+" is a prime number ");
	}
}