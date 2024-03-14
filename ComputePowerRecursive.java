import java.util.*;
public class ComputePowerRecursive {
    static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int temp=power(x, n/2);
        temp=temp*temp;
        if(n%2==0){
            return temp;
        }else{
            return temp*x;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
