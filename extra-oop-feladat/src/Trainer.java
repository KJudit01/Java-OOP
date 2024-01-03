public class Trainer {
    private String name;
    private int age;
    private int experience;

    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }


    public void trainBoxer(Boxer boxer) {
        boxer.increasePower(this.experience);
    }

    public void heal(Boxer boxer) {
        boxer.heal(20);
    }
}
