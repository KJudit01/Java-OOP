public class TaskThree {
    public static void main(String[] args) {
        String text = "Itt van egy példa mondat, ami tartalmaz magyar szavakat.";
        System.out.println(checkingHungarianWords(text));

    }
    public static boolean checkingHungarianWords(String text){
        String[] words = text.split(" ");
        int validWords = 0;
        boolean isValid = true;
        for(String word : words){
            word = word.replaceAll("[.,!?;:]","");
            if(word.matches("^[a-zA-Záéíóöőúüű]+$")){
                validWords++;
            }else{
                isValid = false;
                System.out.println("Not valid word: " + word);
            }
        }
        System.out.println("The number of valid Hungarian words is " + validWords);
        return isValid;
    }
}
