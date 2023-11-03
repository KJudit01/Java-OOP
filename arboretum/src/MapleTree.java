public class MapleTree extends Tree {
    public MapleTree(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    @Override
    String getDescription() {
        return "It is a maple tree with green leaves. Its name is " + this.name + " which is " + this.age + " years old and " + this.height + " meters.";
    }

    @Override
    String getHungarianName() {
        return "juharfa";
    }

    @Override
    void bloom() {
        System.out.printf("Egy %s soha nem virágzik.", this.getHungarianName());
    }

    @Override
    public String toString() {
        return "This tree is a useless type.";
    }
}
