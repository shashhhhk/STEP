import java.util.Scanner;
class digits{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a number :");
		int num=input.nextInt();
		int remain,count=0,temp=num;
		while(temp!=0){
			count++;
			temp/=10;
		}
		System.out.println("the number of digits in "+num+" is "+count);
	}
}
		