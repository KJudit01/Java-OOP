public class OakTree extends Tree{
    public OakTree(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    String getDescription() {
        return "It is an oak tree. Its name is " + this.name + " which is " + this.age + " years old and " + this.height + " meters.";
    }

    @Override
    String getHungarianName() {
        return "tölgyfa";
    }

    @Override
    void bloom() {
        System.out.printf("Egy %s lehet, hogy virágzik.",this.getHungarianName());
    }
}
