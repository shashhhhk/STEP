import java.util.Scanner;
class SimpleInterest{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter principal amount(in Rs),time taken(in years) and rate of interest :");
		double P=input.nextDouble(),T=input.nextDouble(),R=input.nextDouble();
		
		double SI=(P*T*R)/100;
		
		System.out.println("the simple interest is "+SI+" for principal "+P+",rate of interest "+R+" and time taken "+T);
	}	
}
