import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PineTree pineTree = new PineTree("Christmas",10,120);
        PineTree pineTree2 = new PineTree("Easter",20,1200);
        PineTree pineTree3 = new PineTree("New Year",15,200);
        System.out.println(pineTree.getDescription());
        System.out.println(pineTree.getHungarianName());
        pineTree.bloom();
        System.out.println(pineTree);
        System.out.println(pineTree2);
        System.out.println(pineTree3);
        List<Tree> trees = new ArrayList<>();
        trees.add(pineTree);
        trees.add(pineTree2);
        trees.add(pineTree3);

    }
}
