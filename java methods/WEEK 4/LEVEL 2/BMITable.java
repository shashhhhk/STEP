import java.util.Scanner;
public class BMITable{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double[][] data=new double[10][3];
        String[] statuses=new String[10];
        for(int i=0;i<10;i++){
            System.out.print("Enter weight (kg) for person "+(i+1)+": ");
            data[i][0]=scanner.nextDouble();
            System.out.println("Enter height (cm) for person "+(i+1)+": ");
            double heightCm=scanner.nextDouble();
            data[i][1]=heightCm;

            double heightMeters=heightCm/100.0;
            data[i][2]=calculateBMI(data[i][0],heightMeters);
            statuses[i]=determineBMIStatus(data[i][2]);
        }
        for(int i=0;i<10;i++)System.out.println("Person "+(i+1)+" is "+statuses[i]);
    }

    public static double calculateBMI(double weight,double height) {
        return weight/(height*height);
    }

    public static String determineBMIStatus(double bmi){
        if(bmi<=18.4)return "Underweight";
        else if(bmi>=18.5&&bmi<=24.9)return "Normal";
        else if(bmi>=25.0&&bmi<=39.9)return "Overweight";
        else return "Obese";
    }
}
