import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PineTree pineTree = new PineTree("Christmas",10,120);
        PineTree pineTree2 = new PineTree("Easter",20,1200);
        PineTree pineTree3 = new PineTree("New Year",15,200);
        CherryTree cherryTree1 = new CherryTree("sour cherry",5,1000);
        CherryTree cherryTree2 = new CherryTree("blue cherry",2,100);
        CherryTree cherryTree3 = new CherryTree("red cherry",3,1500);
        MapleTree mapleTree1 = new MapleTree("Summer", 2, 20000);
        MapleTree mapleTree2 = new MapleTree("Spring", 3, 30000);
        MapleTree mapleTree3 = new MapleTree("Indian Summer", 4, 25000);
        OakTree oakTree1 = new OakTree("Big",10, 10000);
        OakTree oakTree2 = new OakTree("Wind",100, 20000);
        OakTree oakTree3 = new OakTree("Old",200, 10000000);
        System.out.println(pineTree.getDescription());
        System.out.println(pineTree.getHungarianName());
        pineTree.bloom();
        System.out.println(pineTree2.getDescription());
        System.out.println(pineTree2.getHungarianName());
        pineTree2.bloom();
        System.out.println(pineTree3.getDescription());
        System.out.println(pineTree3.getHungarianName());
        pineTree3.bloom();
        System.out.println(cherryTree1.getDescription());
        System.out.println(cherryTree1.getHungarianName());
        cherryTree1.bloom();
        System.out.println(cherryTree2.getDescription());
        System.out.println(cherryTree2.getHungarianName());
        cherryTree2.bloom();
        System.out.println(cherryTree3.getDescription());
        System.out.println(cherryTree3.getHungarianName());
        cherryTree3.bloom();
        System.out.println(mapleTree1.getDescription());
        System.out.println(mapleTree1.getHungarianName());
        mapleTree1.bloom();
        System.out.println(mapleTree2.getDescription());
        System.out.println(mapleTree2.getHungarianName());
        mapleTree2.bloom();
        System.out.println(mapleTree3.getDescription());
        System.out.println(mapleTree3.getHungarianName());
        mapleTree3.bloom();
        System.out.println(oakTree1.getDescription());
        System.out.println(oakTree1.getHungarianName());
        oakTree1.bloom();
        System.out.println(oakTree2.getDescription());
        System.out.println(oakTree2.getHungarianName());
        oakTree2.bloom();
        System.out.println(oakTree3.getDescription());
        System.out.println(oakTree3.getHungarianName());
        oakTree3.bloom();
        System.out.println(cherryTree1);
        System.out.println(cherryTree2);
        System.out.println(cherryTree3);
        System.out.println(pineTree);
        System.out.println(pineTree2);
        System.out.println(pineTree3);
        List<Tree> trees = new ArrayList<>();
        trees.add(pineTree);
        trees.add(pineTree2);
        trees.add(pineTree3);
        trees.add(cherryTree1);
        trees.add(cherryTree2);
        trees.add(cherryTree3);
        trees.add(mapleTree1);
        trees.add(mapleTree2);
        trees.add(mapleTree3);
        trees.add(oakTree1);
        trees.add(oakTree2);
        trees.add(oakTree3);
        System.out.println(trees);

    }
}
