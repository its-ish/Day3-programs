import java.util.Scanner;
import java.lang.String;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int n=s.length();
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("Not a palindrome");;
                return;
            }
            i++;
            j--;
        }
        System.out.println("palindrome");;
    }
}