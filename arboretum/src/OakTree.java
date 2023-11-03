public class OakTree extends Tree{
    @Override
    String getDescription() {
        return "It is an oak tree. It is a " + this.name + " which is " + this.age + " and " + this.height + " cms tall.";
    }

    @Override
    String getHungarianName() {
        return "tölgyfa";
    }

    @Override
    void bloom() {
        System.out.printf("%s lehet, hogy virágzik.",this.getHungarianName());
    }
}
