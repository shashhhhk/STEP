import java.util.Scanner;
class multiple{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt();
		for(int i=100;i>0;i--)if(i%num==0)System.out.println(i);
	}
}
		