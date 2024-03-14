import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            int t = temp % 10;
            rev = rev * 10 + t;
            temp /= 10;
        }
        return rev==n;
    }

    public static void main(String[] args) {
        System.out.println("Enter the digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
