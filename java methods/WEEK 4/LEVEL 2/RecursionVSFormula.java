import java.util.Scanner;
class RecursionVSFormula{
	public static int Recursion(int n){
		if(n==0)return 0;
		return n+Recursion(n-1);
	}
	public static int Formula(int n){
		return (n*(n+1))/2;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter number :");
		int n=input.nextInt();
		int n1=RecursionVSFormula.Recursion(n);
		int n2=RecursionVSFormula.Formula(n);
		if(n1==n2)System.out.println("Same result");
		else System.out.println("they aren't the same");
	}
}