package occupations;

import occupations.Chef;
import occupations.Gender;
import occupations.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gabor", 43, Gender.MAN);
        person.introduce();
        person.printGoal();

        Chef chef = new Chef("Peter", 42, Gender.MAN);
        chef.introduce();
        chef.cook("broccoli");
        chef.printGoal();

        Person person1 = new Person("Kate", 30, Gender.WOMAN);
        person1.introduce();
        person1.printGoal();

    }
}
