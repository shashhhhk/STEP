import java.util.Scanner;
class TotalSalary{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter salary and bonus :");
		
		double salary=input.nextDouble(),bonus=input.nextDouble();
		double total_salary=salary+bonus;
		
		System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+".Hence the total salary is INR "+total_salary);
	}
}
		