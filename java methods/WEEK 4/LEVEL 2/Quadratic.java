import java.util.*;
public class Quadratic{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a=sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b=sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c=sc.nextDouble();

        List<Double> roots=findRoots(a, b, c);
        if(roots.isEmpty())System.out.println("No real roots.");
        else System.out.println("Roots: " + roots);
    }

    public static List<Double> findRoots(double a,double b,double c){
        double delta=Math.pow(b,2)-4*a*c;
        List<Double> roots=new ArrayList<>();

        if(delta>0){
            roots.add((-b+Math.sqrt(delta))/(2*a)); 
            roots.add((-b-Math.sqrt(delta))/(2*a)); 
        } else if(delta==0){
            roots.add(-b/(2*a));
        }
        return roots;
    }
}
