public class Gym {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Mike", 35, 7);
        Boxer[] boxers = {
                new Boxer("Tom", 25, 100, 20),
                new Boxer("Phil", 28, 120, 15),
                new Boxer("Samuel", 26, 90, 25),
                new Boxer("Kate", 18, 105, 22),
                new Boxer("Alice", 27, 110, 18)
        };
        for (Boxer boxer : boxers) {
            for (int i = 0; i < 3; i++) {
                trainer.trainBoxer(boxer);
            }
        }
        for (int i = 0; i < boxers.length - 1; i++) {
            for (int j = i + 1; j < boxers.length; j++) {
                trainer.heal(boxers[i]);
                trainer.heal(boxers[j]);
            }
        }
        for (Boxer boxer : boxers) {
            System.out.println(boxer);
        }
        Boxer mostWinsBoxer = boxers[0];
        for (int i = 1; i < boxers.length; i++) {
            if (boxers[i].getWins() > mostWinsBoxer.getWins()) {
                mostWinsBoxer = boxers[i];
            }
        }
        System.out.println("Boxer with the most wins: " + mostWinsBoxer.getName() + " with " + mostWinsBoxer.getWins() + " wins.");
    }
}
