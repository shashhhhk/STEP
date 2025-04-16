import java.util.Scanner;
class NoOFRounds{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter the three sides of the triangular park (in meters):");
		double s1=input.nextDouble(),s2=input.nextDouble(),s3=input.nextDouble();
		
		double perimeter=s1+s2+s3;
		double no_of_rounds=5000/perimeter;
		
		System.out.println("The total no.of rounds the athlete will run is "+no_of_rounds+" to complete 5 Km");
	}
}
		