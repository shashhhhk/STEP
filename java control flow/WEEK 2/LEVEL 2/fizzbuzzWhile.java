import java.util.Scanner;
class fizzbuzzWhile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter a positive number to start the fizzbuzz game :");
		int num=input.nextInt(),i=1;
		if(num>0){
			while(i<=num){
				if (i%3==0&&i%5==0){System.out.println("fizzbuzz");i++;continue;}
				else if(i%3==0){System.out.println("fizz");i++;continue;}
				else if(i%5==0){System.out.println("buzz");i++;continue;}
				System.out.println(i);
				i++;
			}
		}
		else System.out.println(num+" is not a natural number ");
	}
}