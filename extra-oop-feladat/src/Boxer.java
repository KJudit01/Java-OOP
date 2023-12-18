public class Boxer {
    private String name;
    private int age;
    private int hitPoints;
    private int power;
    public int wins;

    public Boxer(String name, int age, int hitPoints, int power) {
        this.name = name;
        this.age = age;
        this.hitPoints = hitPoints;
        this.power = power;
        this.wins = 0;
    }

    public void hit(Boxer opponent) {
        opponent.hitPoints -= this.power;
        System.out.println("The boxer called " + this.name + " hit the boxer called " + opponent.name + " with a power of " + this.power + ", leaving the latter with " + opponent.hitPoints + " hit points after the hit.");
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }

    public void fight(Boxer opponent) {
        if (this.hitPoints <= 0) {
            System.out.println("The boxer called " + this.name + " is not alive, so he cannot start the fight.");
        }
        while (this.hitPoints > 0 && opponent.hitPoints > 0) {
            this.hit(opponent);
        }
        System.out.println("The game is over.");
        if (this.hitPoints > 0) {
            System.out.println("The winner is " + this.name + ", the loser is " + opponent.name + ".");
            this.wins++;
        } else {
            System.out.println("The winner is " + opponent.name + ", the loser is " + this.name + ".");
            opponent.wins++;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "+-------------------------------+%n" +
                        "| Name:        %-16s |%n" +
                        "| Age:         %-16d |%n" +
                        "| Wins:        %-16d |%n" +
                        "+-------------------------------+",
                this.name, this.age, this.wins);
    }

    public void increasePower(int amount) {
        this.power += amount;
    }

    public void heal(int amount) {
        this.hitPoints += amount;
    }
}
