
import java.util.Arrays;

public class Min_Max_Tower {
    public static void main(String args[]){
        int arr[] = {3, 9, 12, 16, 20};
        Arrays.sort(arr);
        int n=arr.length;
        int k=2; 
        int diff=arr[n-1]-arr[0];
        int max,min;
        if(n==1){
            System.out.println("0");
        }
        else{
        
        for(int i=1;i<n;i++){
            if(arr[i]-k <0) continue;
            max=Math.max(arr[i-1]+k , arr[n-1]-k);
            min=Math.min(arr[0]+k, arr[i]-k);
            diff=Math.min(diff, max-min);
        }
        System.out.println("Minimum Difference is:"+diff);
    }
    }
}
