import java.util.*;

public class Main {
    public static void main(String[] args) {
        PineTree pineTree = new PineTree("Christmas", 10, 5);
        PineTree pineTree2 = new PineTree("Easter", 20, 12);
        PineTree pineTree3 = new PineTree("New Year", 15, 15);
        CherryTree cherryTree1 = new CherryTree("sour cherry", 5, 2);
        CherryTree cherryTree2 = new CherryTree("blue cherry", 2, 3);
        CherryTree cherryTree3 = new CherryTree("red cherry", 3, 4);
        MapleTree mapleTree1 = new MapleTree("Summer", 2, 7);
        MapleTree mapleTree2 = new MapleTree("Spring", 3, 8);
        MapleTree mapleTree3 = new MapleTree("Indian Summer", 4, 10);
        OakTree oakTree1 = new OakTree("Big", 10, 15);
        OakTree oakTree2 = new OakTree("Wind", 100, 20);
        OakTree oakTree3 = new OakTree("Old", 200, 25);
        List<Tree> trees = new ArrayList<>();
        Set<Tree> treeSet = new HashSet<>();
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
        treeSet.add(pineTree);
        treeSet.add(pineTree2);
        treeSet.add(pineTree3);
        treeSet.add(cherryTree1);
        treeSet.add(cherryTree2);
        treeSet.add(cherryTree3);
        treeSet.add(mapleTree1);
        treeSet.add(mapleTree2);
        treeSet.add(mapleTree3);
        treeSet.add(oakTree1);
        treeSet.add(oakTree2);
        treeSet.add(oakTree3);
        for (Tree tree : trees) {
            System.out.println(tree);
        }
        for (Tree tree : treeSet) {
            System.out.println(tree);
        }
    }
}
