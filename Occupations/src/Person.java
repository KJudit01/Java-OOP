import Gender.Gender;

public class Person {
    String name;
    int age;
    Gender gender;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s.%n", name, age, gender);
    }

    void printGoal() {
        System.out.println("My goal is to be happy in the future.");
    }
}
