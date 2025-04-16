import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Principle amount , Rate of Interest & Time respectively :");
		int P=input.nextInt(),R=input.nextInt(),T=input.nextInt();
		int SI=(P*T*R)/100;
		System.out.print("The simple interest is "+SI+" for principal "+P+",Rate of interest "+R+" and Time "+T);
	}
}