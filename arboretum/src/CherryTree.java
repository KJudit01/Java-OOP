public class CherryTree extends Tree{
    public CherryTree(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    String getDescription() {
        return "It is a cherry tree with green leaves. Its name is " + this.name + " which is " + this.age + " years old and " + this.height + " meters.";
    }

    @Override
    String getHungarianName() {
        return "cseresznyefa";
    }

    @Override
    void bloom() {
        System.out.printf("Egy %s virágzik.",this.getHungarianName());
    }
}
