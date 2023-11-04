回文数的判断
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a,b=0;
        if(x<0){
            System.out.println("false");
        }
        else{
            a=x;
            while(x!=0){
                b=b*10+x%10;
                x=x/10;
            }
            if(a==b){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}

