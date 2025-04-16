import java.util.Random;
public class EmployeeBonus{
  public static int[][] generateEmployeeData(){
    Random rand=new Random();
    int[][] employeeData=new int[10][2];
    for(int i=0;i<10;i++){
      employeeData[i][0]=rand.nextInt(90000)+10000; 
      employeeData[i][1]=rand.nextInt(11); 
    }
    return employeeData;
  }
  public static int[][] calculateNewSalaryAndBonus(int[][] employeeData){
    int[][] updatedData=new int[10][3];
    for(int i=0;i<10;i++){
      int salary = employeeData[i][0];
      int yearsOfService=employeeData[i][1];
      double bonus=0;
      if(yearsOfService>5)bonus=salary*0.05;
      else bonus=salary*0.02;
      int newSalary=(int)(salary+bonus);
      updatedData[i][0]=salary;
      updatedData[i][1]=newSalary;
      updatedData[i][2]=(int)bonus;
    }
    return updatedData;
  }
  public static void calculateTotalsAndDisplay(int[][] updatedData){
    int oldSalarySum=0,newSalarySum=0,totalBonus=0;
    System.out.println("Old Salary | New Salary | Bonus");
    for(int i=0;i<10;i++){
      oldSalarySum+=updatedData[i][0];
      newSalarySum+=updatedData[i][1];
      totalBonus+=updatedData[i][2];
      System.out.println(updatedData[i][0]+" | "+updatedData[i][1]+" | "+updatedData[i][2]);
    }
    System.out.println("Total Old Salary: "+oldSalarySum);
    System.out.println("Total New Salary: "+newSalarySum);
    System.out.println("Total Bonus: "+totalBonus);
  }
  public static void main(String[] args){
    int[][] employeeData=generateEmployeeData();
    int[][] updatedData=calculateNewSalaryAndBonus(employeeData);
    calculateTotalsAndDisplay(updatedData);
  }
}
