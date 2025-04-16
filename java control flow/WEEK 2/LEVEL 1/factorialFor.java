import java.util.Scanner;
class factorialFor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter an integer :");
		int num=input.nextInt(),fac=1;
		//int temp=num;
		for(int i=num;i>0;i--)fac*=i;
		System.out.println("factorial of "+num+" is ="+fac);
	}
}

			