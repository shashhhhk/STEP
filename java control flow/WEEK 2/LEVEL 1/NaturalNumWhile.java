import java.util.Scanner;
class NaturalNumWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a natural number :");
		int num=input.nextInt(),i=0,sum2=0,sum1=0;
		if(num>0){
			sum1=(num*(num+1))/2;
			while(i<=num){
				sum2+=i;
				i++;
			}
		}
		else System.out.println(num+" is not a natural number :");
		System.out.println("the sum with formula = "+sum1+" and with while loop= "+sum2);
	}
}