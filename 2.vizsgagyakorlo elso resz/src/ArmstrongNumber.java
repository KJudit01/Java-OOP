public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;
        System.out.println(number + " is Armstrong: " + isArmstrong(number));
        int armstrongSum = calculateArmstrongSum();
        System.out.println("The sum of Armstrong numbers between 1 and 10000 is " + armstrongSum);
        int primeSum = calculatePrimeSum();
        System.out.println(primeSum);
        double ratio = (double) primeSum / armstrongSum;
        System.out.println(ratio);
    }

    private static int calculatePrimeSum() {
        int sum = 0;
        for (int i = 2; i <= 10000 ; i++) {
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if(number <= 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(number) ; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int calculateArmstrongSum() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;
        for (; originalNumber != 0; originalNumber /= 10, ++n) {
            originalNumber = number;
        }
        for (; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
