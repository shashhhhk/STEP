import java.util.Scanner;
class PoundToKiloG{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter weight in pounds :");
		double pound=input.nextDouble();
		
		double kilo=pound*2.2;
		
		System.out.println("the weight of the person in pound is "+pound+" and in Kg is "+kilo);
	}
}