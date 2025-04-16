import java.util.Scanner;
public class EuclideanDistance{
  public static double findDistance(int x1,int y1,int x2,int y2){
    return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
  }
  public static double[] findEquation(int x1,int y1,int x2,int y2){
    double m=(double)(y2-y1)/(x2-x1);
    double b=y1-m*x1;
    return new double[]{m,b};
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter x1,y1: ");
    int x1=sc.nextInt(),y1=sc.nextInt();
    System.out.print("Enter x2,y2: ");
    int x2=sc.nextInt(),y2=sc.nextInt();
    double distance=findDistance(x1,y1,x2,y2);
    double[] equation=findEquation(x1,y1,x2,y2);
    System.out.println("Euclidean distance: "+distance);
    System.out.println("Equation of the line: y = "+equation[0]+"x + "+equation[1]);
  }
}
