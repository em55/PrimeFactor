import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to generate its prime factors: ");
        int n = s.nextInt();
        System.out.println("Prime Factors of "+n);
        for (int i : generate(n)){
            System.out.println(i);
        }
    }

    public static List<Integer> generate(int n){
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
