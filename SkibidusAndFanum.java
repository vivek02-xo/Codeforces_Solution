import java.util.*;

public class SkibidusAndFanum {
    static final int N = 200005;
    static int[] a = new int[N];
    static int[] b = new int[N];

    static void work(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        for (int j = 1; j <= m; j++) b[j] = sc.nextInt();

        Arrays.sort(b, 1, m + 1);

        int p = Math.min(a[1], b[1] - a[1]);

        for (int i = 2; i <= n; i++) {
            if (Math.max(b[m] - a[i], a[i]) < p) {
                System.out.println("NO");
                return;
            }

            int pos = Arrays.binarySearch(b, 1, m + 1, p + a[i]);
            if (pos < 0) pos = -(pos + 1);

            if (pos > m) {
                p = a[i];
            } else if (a[i] >= p) {
                p = Math.min(b[pos] - a[i], a[i]);
            } else {
                p = b[pos] - a[i];
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            work(sc);
        }
        sc.close();
    }
}
