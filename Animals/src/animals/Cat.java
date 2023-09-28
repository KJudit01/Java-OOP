package animals;

public class Cat extends Animal{
  @Override
    public void eat(){
      System.out.println("The cat eats.");
  }
  @Override
    public void drink(){
      System.out.println("The cat drinks.");
  }
  @Override
    public void makeSound(){
      System.out.println("Miau");
  }
  @Override
    public void move(){
      System.out.println("The cat moves.");
  }
  @Override
    public void sleep(int minutes){
      System.out.println("The cat sleeps " + minutes);
  }

}
