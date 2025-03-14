
import java.util.Scanner;

public class Journey {
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int Sum = a+b+c;

            int d = (n / Sum) * 3;
            int remainder = n % Sum;
            if (remainder == 0) {
                System.out.println(d);
            } else if (remainder <= a) {
                System.out.println(d + 1);
            } else if (remainder <= a + b) {
                System.out.println(d + 2);
            } else {
                System.out.println(d + 3);
            }
        }
        sc.close();
    }
    
}
