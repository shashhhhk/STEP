import java.util.Scanner;
class DivisibleByFive{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num%5==0) System.out.println("Is the number "+num+" divisible by 5? YES");
		else System.out.println("Is the number "+num+" divisible by 5? NO");
	}
}