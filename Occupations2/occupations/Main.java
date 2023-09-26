package occupations;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gábor", 42, Gender.MAN);
        Chef chef = new Chef("Peter", 42, Gender.MAN);
        person.introduce();
        chef.introduce();
        chef.cook("broccoli");
        person.printGoal();
        chef.printGoal();
        chef.cook("Pasta");
        person.introduce();
        person.printGoal();
    }
}
