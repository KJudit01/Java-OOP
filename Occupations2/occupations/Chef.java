package occupations;

public class Chef extends Person {
    public Chef() {

    }

    public Chef(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + name + ". I am " + age + ". I am a " + gender + " and a chef.");
    }

    public void cook(String food) {
        System.out.println(name + " has cooked some " + food + ".");
    }

}
