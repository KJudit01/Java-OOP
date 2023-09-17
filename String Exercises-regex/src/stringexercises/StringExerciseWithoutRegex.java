package stringexercises;

public class StringExerciseWithoutRegex {
    public static void main(String[] args) {
        String barcode = "1234567890123";
        if(isValidEAN13(barcode)){
            System.out.println(barcode + " is valid.");
        }else{
            System.out.println(barcode + " is not valid.");
        }

    }
    public static boolean isValidEAN13(String text){
        if(text.length() == 13){
            return true;
        }else{
            return false;
        }
    }
}
