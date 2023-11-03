import java.util.Objects;

public abstract class Tree {
    String name;
    int age;
    int height;

    @Override
    public String toString() {
        return "Egy " + age + " éves " + name + " nevű fa virágzik.";
    }
    abstract String getDescription();
    abstract String getHungarianName();
    abstract void bloom();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tree)) return false;
        Tree tree = (Tree) o;
        return age == tree.age && height == tree.height && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height);
    }
}
