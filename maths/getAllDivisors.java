import java.util.*;

public class Main {

    public static List<Integer> getAllDivisors(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                small.add(i);
                if (n / i != i) {
                    large.add(n / i);
                }
            }
        }
        
        // Combine and return in sorted order
        Collections.reverse(large);
        small.addAll(large);
        return small;
    }

    public static void main(String[] args) {
        int n = 36;
        List<Integer> divisors = getAllDivisors(n);
        System.out.println(divisors);  // [1, 2, 3, 4, 6, 9, 12, 18, 36]
    }
}
