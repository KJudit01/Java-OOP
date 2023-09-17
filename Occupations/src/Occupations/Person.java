package Occupations;

public class Person {
    String name;
    int age;
    Gender gender;


    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    void introduce() {
        System.out.printf("Hi, my name is %s. I'm %d. I'm a %s.%n", name, age, gender);
    }

    void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }
}
