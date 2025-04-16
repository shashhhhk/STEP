import java.util.Scanner;
class Chocolates{
	public static int[] findRemainingChocolate(int N,int M){
		int[] arr=new int[2];
		arr[0]=N/M;
		arr[1]=N%M;
		return arr;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number of children :");
		int N=input.nextInt();
		System.out.print("enter number of chocolates :");
		int M=input.nextInt();
		
		int[] arr=findRemainingChocolate(N,M);
		System.out.println("The number of chocolates each child gets is "+arr[0]+" and the number of remaining chocolates are "+arr[1]);
	}
}