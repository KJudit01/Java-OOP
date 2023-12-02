class Employee {
    private String name;
    private int age;
    private Occupation occupation;

    public Employee(String name, int age, Occupation occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Occupation getOccupation() {
        return occupation;
    }
}
