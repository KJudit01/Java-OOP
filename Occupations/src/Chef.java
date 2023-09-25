import Gender.Gender;

public class Chef extends Person {
    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef.%n", name, age, gender);
    }

    void cook(String food) {
        System.out.printf("%s has cooked some %s", name, food);
    }
}
