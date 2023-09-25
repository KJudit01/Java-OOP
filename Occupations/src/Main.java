import Gender.Gender;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gabor", 43, Gender.MAN);
        person.introduce();
        person.printGoal();

        Chef chef = new Chef("Gábor", 42, Gender.MAN);
        chef.cook("broccoli. ");
    }
}
