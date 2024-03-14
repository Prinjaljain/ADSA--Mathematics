import java.util.Scanner;

public class TrailingZerosFactorial {
    public static int tz(int n){
        int res=0;
        for(int i=5;i<=n;i=i*5){
            res+=n/i;
        }
        return res;
    }

    //Naive Approach
    // public static int tz(int n) {
    //     int fact = 1;
    //     for (int i = 2; i <= n; i++) {
    //         fact = fact * i;
    //     }
    //     int res = 0;
    //     while (fact % 10 == 0) {
    //         res++;
    //         fact = fact / 10;
    //     }
    //     return res;
    // }

    public static void main(String args[]) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tz(n));
    }
}
