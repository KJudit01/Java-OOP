public class PineTree extends Tree{
    public PineTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
   public String getDescription(){
        return "It is a pine tree with spiky leaves. It is a " + this.name + "which is " + this.age + " and " + this.height + " cms tall.";
    }
    @Override
    public String getHungarianName(){
        return "fenyőfa";
    }
    @Override
    public void bloom(){
        System.out.printf("%s virágzik.",this.getHungarianName());
    }
}
