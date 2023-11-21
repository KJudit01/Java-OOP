public class TaskTwo {
    public static void main(String[] args) {
        String text1 = "a";
        String text2 = "bb";
        String text3 = "ccc";
        String text4 = "dddd";
        System.out.println(getString(text4,text3,text2,text1));


    }
    public static String getString(String text1, String text2, String text3, String text4){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(text1);
        stringBuilder.append(text2);
        stringBuilder.append(text3);
        stringBuilder.append(text4);
        String result = stringBuilder.toString();
        return result;
    }
}
