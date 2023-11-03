package stringexercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringExerciseWithRegex {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String barcode = "1234567890123";
        if (isValidEAN13(barcode)) {
            System.out.println(barcode + " is a valid EAN13 code.");
        } else {
            System.out.println(barcode + " is not a valid EAN13 code.");
        }
        System.out.println("Task 2");
        String phoneNumber = "+3932348976";
        if (isValidItalianPhoneNumber(phoneNumber)) {
            System.out.println(phoneNumber + " is an Italian phone number.");
        } else {
            System.out.println(phoneNumber + " is not an Italian phone number.");
        }
        System.out.println("Task 3");
        String word1 = "hello";
        String word2 = "world";
        String word3 = "hi";
        if (isValidInputWord(word1)) {
            System.out.println("Ok");
        } else if (isValidInputWord(word2)) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
        System.out.println("Task 4");
        String code1 = "ABCXYz3abcde.";
        String code2 = "123XYz3abcde.";
        String code3 = "ABCD1E23FGH.";
        if (isSpecialCode(code1)) {
            System.out.println("valid");
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

    public static boolean isSpecialCode(String code) {
        String pattern = "^[^0-9]{3}[A-Z]{2}[A-Za-z]{2}\\d[1-5].{5}\\.$";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(code);
        return matcher.matches();
    }

    public static boolean isValidInputWord(String word) {
        Pattern pattern = Pattern.compile("^(?i)(hello|world)$");
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }

    static boolean isValidEAN13(String text) {
        return text.matches("[A-Z]{3}[0-9]{2}");
    }

    static boolean isValidItalianPhoneNumber(String input) {
        return input.matches(".[1-9]{10}");
    }
}
