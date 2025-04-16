import java.util.Scanner;
class LargestNumber{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt(),b=input.nextInt(),c=input.nextInt();
		if(a>b&&a>c){
			System.out.println("Is the first number the largest? YES");
			System.out.println("Is the second number the largest? NO");
			System.out.println("Is the third number the largest? NO");
		}
		else if (b>c){
			System.out.println("Is the first number the largest? NO");
			System.out.println("Is the second number the largest? YES");
			System.out.println("Is the third number the largest? NO");
		}
		else{
			System.out.println("Is the first number the largest? NO");
			System.out.println("Is the second number the largest? NO");
			System.out.println("Is the third number the largest? YES");
		}
	}
}