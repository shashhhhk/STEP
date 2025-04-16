import java.util.Scanner;
class factor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number :");
		int num=input.nextInt();
		for(int i=1;i<num;i++)if(num%i==0)System.out.println(i);
	}
}