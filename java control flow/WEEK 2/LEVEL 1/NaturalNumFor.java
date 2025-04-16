import java.util.Scanner;
class NaturalNumFor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a natural number :");
		int num=input.nextInt(),sum2=0,sum1=0;
		if(num>0){
			sum1=(num*(num+1))/2;
			for(int i=1;i<=num;i++)sum2+=i;
		}
		else System.out.println(num+" is not a natural number :");
		System.out.println("the sum with formula = "+sum1+" and with for loop= "+sum2);
	}
}