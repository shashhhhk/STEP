import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a number :");
		int num=input.nextInt();
		int remain,cube=0,temp=num;
		while(temp!=0){
			remain=temp%10;
			cube+=remain*remain*remain;
			temp/=10;
		}
		if(cube==num)System.out.println(num+" is an armstrong number ");
		else System.out.println(num+" is not an armstrong number");
	}
}
		