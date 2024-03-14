import java.util.*;

public class LCM {
    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }

    }

    static int lcm(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("The LCM of a and b is: " + lcm(a, b));
    }
}
