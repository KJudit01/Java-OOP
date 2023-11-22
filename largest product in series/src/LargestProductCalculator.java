public class LargestProductCalculator {
    public static int getLargestProduct(String value, int n) {
        if (value == null || n < 1 || n > value.length()) {
            return -1;
        }
        if (n == 1) {
            return findMaxDigit(value);
        }
        int largestProduct = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= Character.getNumericValue(value.charAt(i));
        }
        largestProduct = product;
        for (int i = n; i < value.length(); i++) {
            int previousDigit = Character.getNumericValue(value.charAt(i - n));
            int currentDigit = Character.getNumericValue(value.charAt(i));
            if (previousDigit != 0) {
                product = (product / previousDigit) * currentDigit;
            } else {
                product = 1;
                for (int j = i - n + 1; j <= i; j++) {
                    product *= Character.getNumericValue(value.charAt(j));
                }
            }
            largestProduct = Math.max(largestProduct, product);
        }
        return largestProduct;
    }

    private static int findMaxDigit(String value) {
        int singleMax = 0;
        for (int i = 0; i < value.length(); i++) {
            singleMax = Math.max(singleMax, Character.getNumericValue(value.charAt(i)));
        }
        return singleMax;
    }
}
