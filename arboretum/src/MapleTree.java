public class MapleTree extends Tree {
    @Override
    String getDescription() {
        return "It is a maple tree with green leaves. It is a " + this.name + "which is " + this.age + " and " + this.height + " cms tall.";
    }

    @Override
    String getHungarianName() {
        return "juharfa";
    }

    @Override
    void bloom() {
        System.out.printf("%s soha nem virágzik ", this.getHungarianName());
    }

    @Override
    public String toString() {
        return "This tree is a useless type.";
    }
}
