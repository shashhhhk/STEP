import java.util.*;
public class RandomStats{
    public static void main(String[] args){
        int[] randomNumbers=generate4DigitRandomArray(5);

        double[] stats=findAverageMinMax(randomNumbers);

        System.out.println("Random Numbers: "+Arrays.toString(randomNumbers));
        System.out.println("Average: "+stats[0]);
        System.out.println("Minimum: "+stats[1]);
        System.out.println("Maximum: "+stats[2]);
    }
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers=new int[size];
        for(int i=0;i<size;i++)numbers[i]=1000+(int)(Math.random()*9000);
        return numbers;
    }
    public static double[] findAverageMinMax(int[] numbers){
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num:numbers){
            sum+=num;
            min=Math.min(min, num);
            max=Math.max(max, num);
        }

        double average=sum/numbers.length;
        return new double[] {average,min,max};  
    }
}
