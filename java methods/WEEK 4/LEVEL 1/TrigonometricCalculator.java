import java.util.Scanner;
class TrigonometricCalculator{
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians=Math.toRadians(angle);
        double sine=Math.sin(radians);
        double cosine=Math.cos(radians);
        double tangent=Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        double angle=input.nextDouble();
        
        double[] results=calculateTrigonometricFunctions(angle);
        
        System.out.println("Sine: "+results[0]);
        System.out.println("Cosine: "+results[1]);
        System.out.println("Tangent: "+results[2]);
    }
}
