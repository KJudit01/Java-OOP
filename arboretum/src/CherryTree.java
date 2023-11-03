public class CherryTree extends Tree{

    @Override
    String getDescription() {
        return "It is a cherry tree with green leaves. It is a " + this.name + "which is " + this.age + " and " + this.height + " cms tall.";
    }

    @Override
    String getHungarianName() {
        return "cseresznyefa";
    }

    @Override
    void bloom() {
        System.out.printf("%s virágzik",this.getHungarianName());
    }
}
