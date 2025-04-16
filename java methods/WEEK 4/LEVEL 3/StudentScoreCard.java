import java.util.Random;
import java.util.Scanner;
public class StudentScoreCard{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[][] scores=new int[n][3];
        for (int i=0;i<n;i++){
            scores[i][0]=rand.nextInt(100);
            scores[i][1]=rand.nextInt(100);
            scores[i][2]=rand.nextInt(100);
        }
        double[][] results=new double[n][3];
        for (int i=0;i<n;i++){
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double average=total/3.0;
            double percentage=(total/300.0)*100;
            results[i][0]=total;
            results[i][1]=Math.round(average*100.0)/100.0;
            results[i][2]=Math.round(percentage*100.0)/100.0;
        }
        for (int i = 0; i < n; i++)System.out.println(results[i][0]+results[i][1]+results[i][2]);
    }
}
