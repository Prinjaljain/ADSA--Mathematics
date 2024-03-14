import java.util.*;

public class CountDigits {
    public static int count(int n) {
        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println("Enter the digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}