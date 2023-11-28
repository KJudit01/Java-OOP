public class Erastothenes {
    public static void main(String[] args) {
        int limit = 1000;
        int[] primes = generatePrimes(limit);
        int sum = calculateSumOfPrimes(primes);
        System.out.println("The sum of the first 1000 primes is: " + sum);
    }

    private static int calculateSumOfPrimes(int[] primes) {
        int sum = 0;
        for (int prime : primes) {
            sum += prime;
        }
        return sum;
    }

    private static int[] generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int counter = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                counter++;
            }
        }
        int[] primes = new int[counter];
        int index = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
        return primes;
    }
}
