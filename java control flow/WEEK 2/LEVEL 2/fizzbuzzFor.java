import java.util.Scanner;
class fizzbuzzFor{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a positive number to start the fizzbuzz game :");
		int num=input.nextInt();
		if(num>0){
			for (int i=1;i<=num;i++)
			{
				if (i%3==0&&i%5==0){System.out.println("fizzbuzz");continue;}
				else if(i%3==0){System.out.println("fizz");continue;}
				else if(i%5==0){System.out.println("buzz");continue;}
				System.out.println(i);
			}
		}
		else System.out.println(num+" is not a natural number ");
	}
}