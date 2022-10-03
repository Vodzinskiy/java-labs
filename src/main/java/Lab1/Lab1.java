package Lab1;

/*
Залікова - 0402
С2 = 0 -> +
C3 = 0
C5 = 2 -> %
C7 = 3 -> long
 */

public class Lab1 {
    public static void main(String[] args) {
        final byte c = 0;

        long a = 1, b = 1, n = 4, m = 3;

        if (a <= -c && -c <= n || b <= 0 && 0 <= m) System.out.println("Division by zero");

        else {
            double res = 0;
            for (long i = a; i <= n; i++) {
                for (long j = b; j <= m; j++) {
                    res += (double) (i % j) / (i + c);
                }
            }
            System.out.println("Result = " + res);
        }
    }
}
