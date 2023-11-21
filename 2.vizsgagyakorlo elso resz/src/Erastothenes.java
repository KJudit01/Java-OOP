public class Erastothenes {
    public static void main(String[] args) {
        int limit = 1000;
        int[] primes = generatePrimes(limit);
        int sum = calculateSumOfPrimes(primes);
        System.out.println("The sum of the first 1000 primes is: " + sum);
    }

    private static int[] calculateSumOfPrimes(int number) {
        boolean[] isPrime = new boolean[number + 1];
        for (int i = 2; i <= number; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= number; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= number; j += i) {
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
        for (int i = 2; i <= number; i++) {
            if (isPrime[i]) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    private static int generatePrimes(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
