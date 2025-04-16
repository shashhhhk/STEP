class SecondLargestMethod{
    public static int SecondLargest(int[] arr){
        int s_1=arr[0],s_2=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i+1;j++){
                if(arr[i]>arr[j]){
                    s_2=s_1;
                    s_1=arr[i];
                }
            }
        }
        return s_2;
    }
    public static void main(String[] args){
        int[] arr={12,35,1,10,34,1};
        System.out.println("second largest element is "+SecondLargest((arr)));
    }
}