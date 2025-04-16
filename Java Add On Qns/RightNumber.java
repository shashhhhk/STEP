import java.util.Scanner;
class RightNumber{
    public static void structure(int rows){
        for(int i=0;i<rows;i++){
            int l=1;
            for(int j=0;j<rows-i-1;j++)System.out.print(" ");
            for(int k=0;k<2*i+1;k++){
                System.out.print(l+" ");
                k++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter number of rows :");
        int row=input.nextInt();
        structure(row);
    }
}