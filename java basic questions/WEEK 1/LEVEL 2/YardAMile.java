import java.util.Scanner;
class YardAMile{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("enter distance in feet :");
		double feet=input.nextDouble();

		double yard=feet/3;
		double mile=yard/1760;

		System.out.println("distance in feet is "+feet+" while in yards is "+yard+" and miles is "+mile);
	}
}