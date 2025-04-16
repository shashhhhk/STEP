import java.util.Scanner;
public class CalendarDisplay{
    static String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    
	static boolean isLeapYear(int year){
        return (year %4==0&&year%100!=0)||(year%400==0);
    }
    static int getFirstDayOfMonth(int year,int month){
        int y0=year-(14-month)/12;
        int x=y0+y0/4-y0/100+y0/400;
        int m0=month+12*((14-month)/12)-2;
        return (1+x+(31*m0)/12)%7;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
		System.out.print("enter month & year :");
        int month=scanner.nextInt(),year=scanner.nextInt();
        if(month<1||month>12||year<1)return;
        if(month==2&&isLeapYear(year))daysInMonth[1]=29;
        System.out.printf("%n%s %d%n",months[month-1],year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int startDay=getFirstDayOfMonth(year,month);
        for(int i=0;i<startDay;i++)System.out.print("    ");
        for(int day=1;day<=daysInMonth[month -1];day++){
			System.out.printf("%3d ",day);
            if((day+startDay)%7==0||day==daysInMonth[month-1])System.out.println();
		}
	}
}

