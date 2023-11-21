public class Primes {
    public static void main(String[] args) {
        int startNumber = 16555;
        int counter = 0;
        int sumOfPrimes = 0;
        System.out.println("The primes are: ");
        while (startNumber > 1) {
            if (isPrime(startNumber)) {
                counter++;
                System.out.print(startNumber + " ");
                sumOfPrimes += startNumber;
                if (counter % 3 == 0) {
                    System.out.println();
                }
            }
            startNumber--;
        }
        System.out.println("Sum of primes between 4000 and 7935: " + sumOfPrimes);
        System.out.println("Is the sum a prime number? " + isPrime(sumOfPrimes));
        double sqrSum = Math.sqrt(sumOfPrimes);
        System.out.println("Is the sum a square? " + (sqrSum % 1 == 0));
        if (sqrSum % 1 != 0) {
            int ceilSqr = (int) Math.ceil(sqrSum);
            int floorSqr = (int) Math.floor(sqrSum);
            System.out.println("Ceiling square " + ceilSqr);
            System.out.println("Floor square: " + floorSqr);
            int nearestPrime = getNearestPrime(sumOfPrimes);
            int nearestSquare = getNearestSquare(sumOfPrimes);
            System.out.println("The nearest prime is " + nearestPrime);
            System.out.println("The nearest square is " + nearestSquare);
        }

    }

    private static int getNearestSquare(int number) {
        int smaller = number - 1;
        int larger = number + 1;
        while (true) {
            if (isPrime(smaller)) {
                return smaller;
            } else if (isPrime(larger)) {
                return larger;
            }
            smaller--;
            larger++;
        }
    }

    private static int getNearestPrime(int number) {
        int smaller = (int) Math.pow((int) Math.sqrt(number) - 1, 2);
        int larger = (int) Math.pow((int) Math.sqrt(number) + 1, 2);
        while (true) {
            if (smaller >= 0 && Math.sqrt(smaller) % 1 == 0) {
                return smaller;
            } else if (Math.sqrt(larger) % 1 == 0) {
                return larger;
            }
            smaller--;
            larger++;
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
