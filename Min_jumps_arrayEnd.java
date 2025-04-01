public class Min_jumps_arrayEnd {
    public static int jumps(int []arr){
        if(arr.length <=1){
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        int maxReach = arr[0];  
        int steps = arr[0];     
        int jump = 1;            

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) return jump; 

            maxReach = Math.max(maxReach, i + arr[i]); 
            steps--; 

            if (steps == 0) { 
                jump++;
                steps = arr[i]; 
            }
        }
        return jump;
    }
    public static void main(String[] args) {
        int [] arr={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int ans=jumps(arr);
        System.out.println(ans);
    }
}
