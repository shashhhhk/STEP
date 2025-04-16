import java.util.Scanner;
class GreatestFactor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int num=input.nextInt(),gf=1;
		for(int i=num-1;i>=1;i--)if(num%i==0){gf=i;break;}
		System.out.println("greatest factor of "+num+" is "+gf);
	}
}