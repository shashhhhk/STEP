import java.util.Scanner;
class power{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter base and exponent :");
		int num=input.nextInt(),pow=input.nextInt(),result=1;
		for(int i=1;i<=pow;i++)result*=num;
		System.out.println(num+" power "+pow+" = "+result);
	}
}