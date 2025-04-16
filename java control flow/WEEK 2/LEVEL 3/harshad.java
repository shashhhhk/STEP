import java.util.Scanner;
class harshad{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		int remain,sum=0,temp=num;
		while(temp!=0){
			remain=temp%10;
			sum+=remain;
			temp/=10;
		}
	if(num%sum==0)System.out.println(num+" is a harshad number ");
	else System.out.println(num+" is not a harshad number ");
	}
}