import java.util.Scanner;
class GradeTwo{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents=scanner.nextInt();

        int[][] marks=new int[numStudents][3];
        double[] percentages=new double[numStudents];
        char[] grades=new char[numStudents];

        for (int i=0;i<numStudents;i++){
            System.out.println("\nEnter marks for Student "+(i+1)+":");
            System.out.print("Physics: ");
            marks[i][0]=scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1]=scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2]=scanner.nextInt();

            percentages[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;

            if(percentages[i]>=80){
                grades[i]='A';
            }else if(percentages[i]>=70){
                grades[i]='B';
            }else if(percentages[i]>=60){
                grades[i]='C';
            }else if(percentages[i]>=50){
                grades[i]='D';
            }else if(percentages[i]>=40){
                grades[i]='E';
            }else{
                grades[i]='R';
            }
        }

        System.out.println("\nStudent Results:");
        for (int i=0;i<numStudents;i++){
            System.out.println("Student "+(i+1)+" : "+grades[i]);
        }
    }
}
