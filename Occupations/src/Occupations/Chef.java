package Occupations;

public class Chef extends Person {
    public Chef() {
        super();
    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.printf("Hi, my name is %s. I'm %d. I'm a %s and a chef.%n",name,age,gender);
    }

    void cook(String food) {
        System.out.printf("%s has cooked some %s.%n",name,food);
    }
}
