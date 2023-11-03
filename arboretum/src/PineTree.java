public class PineTree extends Tree{
    public PineTree(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
   public String getDescription(){
        return "It is a pine tree with spiky leaves. Its name is " + this.name + " which is " + this.age + " years old and " + this.height + " meters.";
    }
    @Override
    public String getHungarianName(){
        return "fenyőfa";
    }
    @Override
    public void bloom(){
        System.out.printf("Egy %s virágzik.",this.getHungarianName());
    }
}
