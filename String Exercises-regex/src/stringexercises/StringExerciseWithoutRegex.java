package stringexercises;

import java.util.Locale;

import static stringexercises.StringExerciseWithRegex.isSpecialCode;

public class StringExerciseWithoutRegex {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String barcode = "1234567890123";
        if (isValidEAN13Normal(barcode)) {
            System.out.println(barcode + " is valid.");
        } else {
            System.out.println(barcode + " is not valid.");
        }
        System.out.println("Task 2");
        String phoneNumber = "+3932348976";
        if (isValidItalianPhoneNumberNormal(phoneNumber)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
        System.out.println("Task 3");
        String word1 = "hello";
        String word2 = "world";
        String word3 = "hi";
        if (isValidInputWordNormal(word1)) {
            System.out.println("Ok");
        } else if (isValidInputWordNormal(word2)) {
            System.out.println("OK");
        } else if (isValidItalianPhoneNumberNormal(word3)) {
            System.out.println("Not OK");
        } else {
            System.out.println("NO");
        }
        System.out.println("Task 4");
        String code1 = "ABCXYz3abcde.";
        String code2 = "123XYz3abcde.";
        String code3 = "ABCD1E23FGH.";
        if (isSpecialCode(code1)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid!");
        }
        if (isSpecialCode(code2)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid!");
        }
        if (isSpecialCode(code3)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid!");
        }
    }

    public static boolean isValidInputWordNormal(String word) {
        String lowerCaseWord = word.toLowerCase();
        return "hello".equals(lowerCaseWord) || "world".equals(lowerCaseWord);
    }

    public static boolean isValidItalianPhoneNumberNormal(String phoneNumber) {
        if (phoneNumber.startsWith("+39") && phoneNumber.length() >= 3) {
            String numberWithoutPrefix = phoneNumber.substring(3);
            if (numberWithoutPrefix.charAt(0) == 3 && numberWithoutPrefix.length() == 9 || numberWithoutPrefix.length() == 10) {
                for (int i = 1; i < numberWithoutPrefix.length(); i++) {
                    if (!Character.isDigit(numberWithoutPrefix.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isValidEAN13Normal(String text) {
        if (text.length() == 13) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSpecialCode(String code) {
        if (code.length() != 11) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (Character.isDigit(code.charAt(i))) {
                return false;
            }
        }
        for (int i = 3; i < 5; i++) {
            if (!Character.isUpperCase(code.charAt(i))) {
                return false;
            }
        }
        for (int i = 5; i < 7; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return false;
            }
        }
        if (!Character.isDigit(code.charAt(7))) {
            return false;
        }
        char digitCharacter = code.charAt(8);
        if (digitCharacter < 1 || digitCharacter > 5) {
            return false;
        }
        if (code.charAt(10) != '.') {
            return false;
        }
        return true;
    }
}
