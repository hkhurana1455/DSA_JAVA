import java.util.Arrays;
public class Next_permutation {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[]nums={4,5,3,2,1};
        if(nums.length==1){
            return;
        }
        int idx1=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx1=i;
                break;
            }
        }
        if(idx1<0){
            int start = 0;
            int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(nums));
        return;
    }
        
    
            int idx2=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]>nums[idx1]){
                idx2=i;
                break;
            }
        }
        swap(nums,idx1, idx2);
        Arrays.sort(nums, idx1+1, nums.length);
        System.out.println(Arrays.toString(nums));
    }
   
}

