public class RichestCustomer {
    static int search(int [][]arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int rowsum=0;
        for(int j=0;j<arr[i].length;j++){
            rowsum+=arr[i][j];
        }
        if(rowsum>max){
            max=rowsum;
        }
    }
    return max;
}
    public static void main(String[] args) {
        int [][] accounts={{1,2,3},{4,2,1}};
        int ans=search(accounts);
        System.out.println(ans);
    }
}
