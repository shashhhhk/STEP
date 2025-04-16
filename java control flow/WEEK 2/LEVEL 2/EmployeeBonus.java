import java.util.Scanner;
public class EmployeeBonus{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary=scanner.nextDouble();
        System.out.print("Enter your years of service: ");
        int years=scanner.nextInt();
        if (years>5){
            double bonus=0.05*salary;
            System.out.println("Congratulations! You get a bonus of: Rs"+bonus);
        } 
		else System.out.println("Sorry, you are not eligible for a bonus.");
    }
}
