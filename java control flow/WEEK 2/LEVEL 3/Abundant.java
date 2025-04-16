import java.util.Scanner;
class Abundant{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		int remain,sum=0,temp=num;
		for(int i=1;i<num;i++)if(num%i==0)sum+=i;
	if(sum>num)System.out.println(num+" is an abundant number ");
	else System.out.println(num+" is not an abundant number ");
	}
}