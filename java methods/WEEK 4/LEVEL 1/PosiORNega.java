import java.util.Scanner;
class PosiORNega{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter an integer :");
		int num=input.nextInt();
		if(num>0)System.out.print("1");
		else if(num<0)System.out.print("-1");
		else System.out.print("0");
	}
}