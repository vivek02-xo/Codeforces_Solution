
import java.util.Scanner;

public class Fibonacciness {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int arr[] = new int[5];
            for(int i = 0; i < 4;i++){
                arr[i] = sc.nextInt();  
            }
            int m1 = arr[0] + arr[1];
            int m2 = arr[2] - arr[1];
            int m3 = arr[3] - arr[2];

            if(m1 == m2 && m2 == m3){
                System.out.println(3);
            }else if(m1 == m2 || m2 == m3 || m1 == m3){
                System.out.println(2);
            }else{
                System.out.println(1);
            }
        }
    }
}
