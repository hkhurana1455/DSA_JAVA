import java.util.Scanner;
public class prime_no{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        double number=Math.sqrt(n);
        boolean flag=false;
        if(n==1){
            System.out.println("neither prime nor composite");
        }
        else{
        for(int i=2;i<=number;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println(("Not prime"));
        }
        else{
            System.out.println("Prime");
        }
    }
}
}