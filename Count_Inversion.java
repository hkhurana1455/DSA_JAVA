public class Count_Inversion {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        int count=0;
        if(arr.length==0 || arr.length==1){
            System.out.println("No Inversions possible");
        }
        else{
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println("Number of Inversions are:"+count);
    }
}
}
