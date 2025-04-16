import java.util.Scanner;
class SideOFSquare{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter perimeter :");
		double perimeter=input.nextDouble();
		
		double side=perimeter/4;
		
		System.out.println("the length of the side is "+side+" whose perimeter is "+perimeter);
	}
}