package stringexercises;

public class StringExerciseWithRegex {
    public static void main(String[] args) {
        String barcode = "1234567890123";
        if (isValidEAN13(barcode)) {
            System.out.println(barcode + " is a valid EAN13 code.");
        } else {
            System.out.println(barcode + " is not a valid EAN13 code.");
        }
        String phoneNumber = "+3932348976";
        if (isValidItalianPhoneNumber(phoneNumber)) {
            System.out.println(phoneNumber + " is an Italian phone number.");
        } else {
            System.out.println(phoneNumber + " is not an Italian phone number.");
        }

    }

    static boolean isValidEAN13(String text) {
        return text.matches("[A-Z]{3}[0-9]{2}");
    }

    static boolean isValidItalianPhoneNumber(String input) {
        return input.matches(".[1-9]{10}");
    }
}