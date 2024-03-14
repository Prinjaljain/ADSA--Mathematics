import java.util.*;

public class PrintAllDivisors {
    static void Factors(int n) {
        int i;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (; i > 1;) {
            i--;
            if (i != n / i && n % i == 0)
                System.out.print(n / i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        Factors(n);
    }
}
