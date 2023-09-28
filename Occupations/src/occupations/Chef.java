package occupations;

import occupations.Person;

public class Chef extends Person {
    public Chef() {

    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    void introduce() {
        System.out.printf("Hi, my name is %s. I am %d. I am a %s and a chef. %n", this.getName(), this.getAge(), this.getGender());
    }

    void cook(String food) {
        System.out.printf("%s has cooked some %s. ", this.getName(), food);
    }

}
