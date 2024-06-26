import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        int sum =0;
        int a;
        while(count>0){
            a=count%10;
            sum+=(a*a*a);
            count=count/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}