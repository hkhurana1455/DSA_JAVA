public class Max_Sum_Subarray {
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int n=arr.length;
        int result=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>result){
                result=sum;
            }
            if(sum<0){
                sum=0;
            }
            }
            System.out.println("The maximum sum of a subarray is:"+result);
        }
    }


