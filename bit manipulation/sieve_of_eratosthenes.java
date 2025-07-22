import java.util.*;
//sieve of eratosthenes  // O(n log log n)

public class Main {

    public static void sieveOfEratosthenes(int n) {
        // Step 1: Create a boolean array and initialize all as true
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;  // 0 is not prime
        isPrime[1] = false;  // 1 is not prime

        // Step 2: Eliminate non-primes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as not prime
                }
            }
        }

        // Step 3: Print all primes
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 50;  // Example: find primes up to 50
        sieveOfEratosthenes(n);
    }
}
