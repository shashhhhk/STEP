import java.util.Scanner;
class VoteAge{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter age :");
		int age=input.nextInt();
		if(age>=18) System.out.println("the person's age is "+age+" and can vote");
		else System.out.println("the person's age is "+age+" and cannot vote");
	}
}