import java.util.Scanner;
class LeapYear{
	public static void checkleap(int year){
		if(year>=1582){
			if((year%4==0&&year%100!=0)||year%400==0)System.out.println("Leap Year");
			else System.out.println("not a leay year");
		}
		else System.out.println("not a leap year");
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter year :");
		int year=input.nextInt();
		checkleap(year);
	}
}