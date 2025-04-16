import java.util.Scanner;
class WindChill{
	public static double calcWindChill(double temp,double speed){
		double Chill=35.74+0.6215*temp+(0.4275*temp-35.75)*speed;
		return Chill;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter temperature and wind speed respectively :");
		double t=input.nextDouble(),w=input.nextDouble();
		double Ch=calcWindChill(t,w);
		System.out.println("WindChill ="+Ch);
	}
}