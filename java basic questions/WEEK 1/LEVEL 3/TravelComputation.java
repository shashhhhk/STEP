import java.util.Scanner;
class TravelComputation{
	public static void main(String[] args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("who is travelling? -");
		String name=input.nextLine();
		
		System.out.print("which is the starting city? -");
		String fromCity=input.nextLine();
		
		System.out.print("via which city? -");
		String viaCity=input.nextLine();
		
		System.out.print("to which city? -");
		String toCity=input.nextLine();
		
		System.out.print("what's the distance between "+fromCity+" and "+viaCity+"? (enter in miles)- ");
		double distancefromtovia=input.nextDouble();
		
		System.out.print("what's the distance between "+viaCity+" and "+toCity+"? (enter in miles)- ");
		double distancrviatoto=input.nextDouble();
		
		System.out.print("what's the time taken from "+fromCity+" to "+viaCity+"? (enter in hours)- ");
		double timefromtovia=input.nextDouble();
		
		System.out.print("what's the time taken from "+viaCity+" to "+toCity+"? (enter in hours)- ");
		double timeviatoto=input.nextDouble();
		
		double totaldist=distancefromtovia+distancrviatoto;
		double totaltime=timefromtovia+timeviatoto;
		
		System.out.println("The total distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totaldist+" miles\nThe total time taken is "+totaltime+" hours");
	}
}