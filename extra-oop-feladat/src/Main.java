import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Coach Mike", 45, 7);
        List<Boxer> boxers = new ArrayList<>();
        boxers.add(new Boxer("John", 25, 100, 10));
        boxers.add(new Boxer("Dave", 30, 120, 15));
        boxers.add(new Boxer("Steve", 28, 110, 12));
        boxers.add(new Boxer("Bob", 32, 115, 13));
        boxers.add(new Boxer("Alex", 27, 105, 11));
        for (Boxer boxer : boxers) {
            for (int i = 0; i < 3; i++) {
                trainer.trainBoxer(boxer);
            }
        }
        for (int i = 0; i < boxers.size(); i++) {
            for (int j = 0; j < boxers.size(); j++) {
                if (i != j) {
                    boxers.get(i).fight(boxers.get(j));
                    trainer.heal(boxers.get(i));
                    trainer.heal(boxers.get(j));
                }
            }
        }
        for (Boxer boxer : boxers) {
            System.out.println(boxer);
        }
        Boxer topBoxer = boxers.get(0);
        for (Boxer boxer : boxers) {
            if (boxer.getWins() > topBoxer.getWins()) {
                topBoxer = boxer;
            }
        }
        System.out.println("Top Boxer: " + topBoxer.getName());
    }
}
