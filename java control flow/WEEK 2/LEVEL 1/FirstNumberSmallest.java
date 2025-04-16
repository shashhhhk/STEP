import java.util.Scanner;
class FirstNumberSmallest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
		if(a<b && a<c) System.out.println("Is the first number the smallest? YES");
		else System.out.println("Is the first number the smallest? NO");
	}
}