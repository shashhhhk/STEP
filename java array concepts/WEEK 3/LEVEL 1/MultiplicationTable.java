import java.util.Scanner;
class MultiplicationTable{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int number=input.nextInt();
		int[] multiply=new int[10];
		for(int i=0;i<10;i++)multiply[i]=number*(i+1);
		for(int i=0;i<10;i++)System.out.println(number+"*"+(i+1)+"="+multiply[i]);
	}
}