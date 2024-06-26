import java.util.Scanner;
class cl1{
    int add(int a,int b){
        if(a>10 && b>10){
            System.out.println(a+b);
        }else{
            System.out.println("Enter a number greater than 10");
        }
    return a+b;
    }
    int sub(int a,int b){
        if(a%2==0 && b%2==0){
            System.out.println(a-b);
        }else{
            System.out.println("Enter an even number");
        }
    return a-b;
    }
}
public class Main {
    public static void main(String[] args) {
        cl1 c1 = new cl1();
        int sum = c1.add(15,20);
        int sub = c1.sub(12,20);
    }
}