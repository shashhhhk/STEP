import java.util.Scanner;
class AreaOFTriangle{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter base in cm :");
		double base=input.nextDouble();
		
		System.out.print("enter height in cm:");
		double height=input.nextDouble();
		
		double area=0.5*base*height;
		
		double inch=area*0.155;
		
		System.out.println("area in squared cm is "+area+" and in squared inch is "+inch);
	}
}