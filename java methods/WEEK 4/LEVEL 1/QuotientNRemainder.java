import java.util.Scanner;
class QuotientNRemainder{
	public static int[] findRemainderAndQuotient(int number,int divisor){
		int[] arr=new int[2];
		arr[0]=number/divisor;
		arr[1]=number%divisor;
		return arr;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter two numbers :");
		int number=input.nextInt(),divisor=input.nextInt();
		int[] arr=findRemainderAndQuotient(number,divisor);
		System.out.println("quotient : "+arr[0]+" remainder :"+arr[1]);
	}
}