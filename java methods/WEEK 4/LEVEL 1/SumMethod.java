import java.util.Scanner;
class SumMethod{
	public static int calc_sum(int n){
		int i=1,sum=0;
		while(i<=n){
			sum+=i;
			i++;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a positive integer :");
		int n=input.nextInt();
		int sum=SumMethod.calc_sum(n);
		System.out.println("the sum of "+n+" natural numbers is "+sum);
	}
}
		