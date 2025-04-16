import java.util.Scanner;

class KilotoMileinp{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the kilometer that needs to be changed to miles :");
		int Km=input.nextInt();
		double mile=1.6;
		
		double calcmile=Km*mile;
		
		System.out.println("The total miles is "+calcmile+" mile for the given "+Km+" km");
	}
}