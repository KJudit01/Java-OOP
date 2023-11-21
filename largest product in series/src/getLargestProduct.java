public class getLargestProduct {
    public static int getLargestProduct(String value, int n) {
        if (n < 1 || n > value.length() || value == null) {
            return -1;
        }
        int largestProduct = 0;
        for (int i = 0; i < value.length() - n; i++) {
            int product = 1;
            for (int j = i; j < i + n; j++) {
                product *= Character.getNumericValue(value.charAt(j));
            }
            largestProduct = Math.max(largestProduct, product);
        }
        if (n == 1) {
            int singleMax = 0;
            for (int i = 0; i < value.length(); i++) {
                singleMax = Math.max(singleMax, Character.getNumericValue(value.charAt(i)));
            }
            return singleMax;
        }
        return largestProduct;
    }
}
