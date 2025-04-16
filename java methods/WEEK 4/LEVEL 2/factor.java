import java.util.Scanner;
class factor{
    public static int[] findFactors(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                factors[index]=i;
                index++;
            }
        }
        return factors;
    }
    public static int sumOfFactors(int[] factors){
        int sum=0;
        for(int factor:factors){
            sum+=factor;
        }
        return sum;
    }
    public static long productOfFactors(int[] factors){
        long product=1;
        for(int factor:factors){
            product*=factor;
        }
        return product;
    }
    public static double sumOfSquareOfFactors(int[] factors){
        double sumOfSquares=0;
        for(int factor:factors){
            sumOfSquares+=Math.pow(factor,2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        int[] factors=findFactors(num);
        System.out.print("Factors of "+num+" are: ");
        for(int factor:factors){
            System.out.print(factor+" ");
        }
        System.out.println();
        
        int sum=sumOfFactors(factors);
        System.out.println("Sum of the factors: "+sum);
        
        long product=productOfFactors(factors);
        System.out.println("Product of the factors: "+product);
        
        double sumOfSquares=sumOfSquareOfFactors(factors);
        System.out.println("Sum of square of the factors: "+sumOfSquares);
    }
}
