public class Duplicate {
    public static int FindDuplicate(int nums[], int n){
        if(n==1){
            System.out.println("No Duplicate");
        }
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        int result=FindDuplicate(nums, nums.length);
        System.out.println("Duplicate Number is:"+result);
    }
}
