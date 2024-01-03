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
        if (this.hitPoints > 0) {
            opponent.hitPoints -= this.power;
            System.out.println(this.name + " with power " + this.power + " hit " + opponent.name + ", leaving them with " + opponent.hitPoints + " hit points.");
        }
    }

    public int getWins() {
        return wins;
    }

    public String getName() {
        return name;
    }

    public void fight(Boxer opponent) {
        if (this.hitPoints <= 0) {
            System.out.printf("The boxer called %s is not alive and cannot start the fight.", this.name);
            return;
        }
        while (this.hitPoints > 0 && opponent.hitPoints > 0) {
            this.hit(opponent);
            if (opponent.hitPoints > 0) {
                opponent.hit(this);
            }
        }
        if (this.hitPoints > 0) {
            this.wins++;
            System.out.println("Match over. Winner: " + this.name);
        } else {
            opponent.wins++;
            System.out.println("Match over. Winner: " + opponent.name);
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
