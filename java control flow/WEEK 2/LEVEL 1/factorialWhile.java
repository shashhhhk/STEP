import java.util.Scanner;
class factorialWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter an integer :");
		int num=input.nextInt(),fac=1;
		int temp=num;
		while(temp>0){
			fac*=temp;
			temp--;
		}
		System.out.println("factorial of "+num+" is ="+fac);
	}
}
			