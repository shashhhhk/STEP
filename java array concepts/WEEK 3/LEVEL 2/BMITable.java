import java.util.Scanner;
class BMITable{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numPersons=input.nextInt();
        double[] weights=new double[numPersons];
        double[] heights =new double[numPersons];
        double[] bmiValues=new double[numPersons];
        String[] weightStatus=new String[numPersons];
		
        for (int i=0;i<numPersons;i++){
            System.out.println("Enter details for person "+(i+1)+": ");
            System.out.print("Weight (kg): ");
            weights[i]=input.nextDouble();
            System.out.print("Height (m): ");
            heights[i]=input.nextDouble();
        }
        for (int i=0;i<numPersons;i++){
            bmiValues[i]=weights[i]/(heights[i]*heights[i]);
            if (bmiValues[i]<=18.4){
                weightStatus[i]="Underweight";
            }else if(bmiValues[i]>=18.5&&bmiValues[i]<=24.9){
                weightStatus[i]="Normal";
            }else if(bmiValues[i]>=25.0&&bmiValues[i]<=39.9){
                weightStatus[i]="Overweight";
            }else{
                weightStatus[i]="Obese";
            }
        }
        System.out.println("\nBMI Results:");
        for (int i=0;i<numPersons;i++){
            System.out.println("person "+(i+1)+" is "+weightStatus[i]);
        }
    }
}
