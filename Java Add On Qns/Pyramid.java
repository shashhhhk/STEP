import java.util.Scanner;
class Pyramid{
    public static void structure(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++)System.out.print(" ");
            for(int k=0;k<2*i+1;k++)System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter rwos :");
        int row=input.nextInt();
        structure(row);
    }
}