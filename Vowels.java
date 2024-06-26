import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(b=='a'||b=='e'|| b=='i'||b=='o'||b=='u')
            {
                count=count+1;

            }
        }
        System.out.println(count);
    }
}