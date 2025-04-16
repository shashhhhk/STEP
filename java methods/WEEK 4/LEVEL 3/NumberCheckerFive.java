import java.util.Scanner;
public class NumberCheckerFive{
  public static int[] findFactors(int number){
    int count=0;
    for(int i=1;i<=number;i++)if(number%i==0)count++;
    int[] factors=new int[count];
    int index=0;
    for(int i=1;i<=number;i++)if(number%i==0)factors[index++]=i;
    return factors;
  }
  public static int greatestFactor(int[] factors){
    int max=0;
    for(int factor:factors)if(factor>max)max=factor;
    return max;
  }
  public static int sumOfFactors(int[] factors){
    int sum=0;
    for(int factor:factors)sum+=factor;
    return sum;
  }
  public static int productOfFactors(int[] factors){
    int product=1;
    for(int factor : factors)product*=factor;
    return product;
  }
  public static double productOfCubesOfFactors(int[] factors){
    double product=1;
    for(int factor:factors)product*=Math.pow(factor,3);
    return product;
  }
  public static boolean isPerfectNumber(int number){
    int[] factors=findFactors(number);
    int sum=sumOfFactors(factors)-number;
    return sum==number;
  }
  public static boolean isAbundantNumber(int number){
    int[] factors=findFactors(number);
    int sum=sumOfFactors(factors)-number;
    return sum>number;
  }
  public static boolean isDeficientNumber(int number){
    int[] factors=findFactors(number);
    int sum=sumOfFactors(factors)-number;
    return sum<number;
  }
  public static boolean isStrongNumber(int number){
    int sum=0;
    int temp=number;
    while(temp>0){
      int digit=temp%10;
      sum+=factorial(digit);
      temp/=10;
    }
    return sum==number;
  }
  public static int factorial(int num){
    int fact=1;
    for(int i=1;i<=num;i++)fact*=i;
    return fact;
  }
  public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.print("enter number :");
    int number =scanner.nextInt();
    int[] factors = findFactors(number);
    System.out.println("Factors: ");
    for(int factor:factors)System.out.print(factor+" ");
    System.out.println("\nGreatest factor: "+greatestFactor(factors));
    System.out.println("Sum of factors: "+sumOfFactors(factors));
    System.out.println("Product of factors: "+productOfFactors(factors));
    System.out.println("Product of cubes of factors: "+productOfCubesOfFactors(factors));
    System.out.println("Is perfect number: "+isPerfectNumber(number));
    System.out.println("Is abundant number: "+isAbundantNumber(number));
    System.out.println("Is deficient number: "+isDeficientNumber(number));
    System.out.println("Is strong number: "+isStrongNumber(number));
  }
}
