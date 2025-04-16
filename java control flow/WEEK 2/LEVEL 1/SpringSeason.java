import java.util.Scanner;
class SpringSeason{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter month (1-12):");
		int month=input.nextInt();
		System.out.print("enter day :");
		int day=input.nextInt();
		if(month>=3 && month<=6){
			if(day>=20&&day<=31) System.out.println("its a spring season");
			else System.out.println("its not a spring season");
		}
		else System.out.println("its not a spring season");
	}
}