import java.util.Scanner;

public class FizzBuzzRemixed2070A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            long n = scanner.nextLong();
            long count = (n / 15) * 3; 

            long remainder = n % 15;
            if (remainder >= 0) count++;  
            if (remainder >= 1) count++;  
            if (remainder >= 2) count++; 

            System.out.println(count);
        }
        scanner.close();
    }
}
