import java.util.Scanner;
class DayofWeek{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter year , month and day respectively :");
		int year=input.nextInt(),month=input.nextInt(),day=input.nextInt();
		
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+(31*m0)/12)%7;
		
		if(d0==0)System.out.println("the day of the week is sunday");
		else if(d0==1)System.out.println("the day of the week is monday");
		else if(d0==2)System.out.println("the day of the week is tuesday");
		else if(d0==3)System.out.println("the day of the week is wednesday");
		else if(d0==4)System.out.println("the day of the week is thursday");
		else if(d0==5)System.out.println("the day of the week is friday");
		else if(d0==6)System.out.println("the day of the week is saturday");
	}
}
		