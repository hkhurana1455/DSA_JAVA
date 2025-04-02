public class kadane_algo {
    public static void main(String[] args) {
        int result= Integer.MIN_VALUE;
        int []arr={2, 3, -8, 7, -1, 2, 3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            result=Math.max(sum, result);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(result);
    }
}
