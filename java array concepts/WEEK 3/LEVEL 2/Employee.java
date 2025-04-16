import java.util.Scanner;
public class Employee{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        final int EMPLOYEES=10;
        double[] salaries=new double[EMPLOYEES];
        double[] yearsOfService=new double[EMPLOYEES];
        double[] bonuses=new double[EMPLOYEES];
        double[] newSalaries=new double[EMPLOYEES];
        
        double totalOldSalary=0,totalNewSalary=0,totalBonus=0;        
        
        for(int i=0;i<EMPLOYEES;i++){
            while(true){
                try{
                    System.out.print("Enter salary for employee "+(i+1)+": ");
                    double salary=Double.parseDouble(input.nextLine());
                    
                    System.out.print("Enter years of service for employee "+(i+1)+": ");
                    double years=Double.parseDouble(input.nextLine());
                    
                    if(salary<=0||years<0){
                        System.out.println("Invalid input. Salary must be positive and years of service cannot be negative.");
                        continue;
                    }
                    salaries[i]=salary;
                    yearsOfService[i]=years;
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }
        }
        
        for (int i=0;i<EMPLOYEES;i++){
            double bonusPercentage=(yearsOfService[i]>5)?0.05:0.02;
            bonuses[i]=salaries[i]*bonusPercentage;
            newSalaries[i]=salaries[i]+bonuses[i];
            
            totalOldSalary+=salaries[i];
            totalNewSalary+=newSalaries[i];
            totalBonus+=bonuses[i];
        }
       
        System.out.println("\nEmployee-wise Details:");
        for (int i=0;i<EMPLOYEES;i++){
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                    (i+1),salaries[i],bonuses[i],newSalaries[i]);
        }
        
        System.out.println("\nTotal Old Salary: "+totalOldSalary);
        System.out.println("Total Bonus Payout: "+totalBonus);
        System.out.println("Total New Salary: "+totalNewSalary);
    }
}
