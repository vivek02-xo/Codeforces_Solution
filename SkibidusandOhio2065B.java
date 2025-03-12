
import java.util.Scanner;

public class SkibidusandOhio2065B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            String str = sc.next();
            int len = str.length();
            int count = 0;
            
            for(int i = 1; i < len; i++){
                if(str.charAt(i-1) != str.charAt(i)){
                    count++;
                }else{
                    System.out.println(1);
                    break;
                }
            }
            if(count == len-1){
                System.out.println(len);
            }

        }
    }
}
