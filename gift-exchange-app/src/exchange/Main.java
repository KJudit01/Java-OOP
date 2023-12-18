package exchange;

import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidWishListException{
        Person person = new Person("Jack",40, List.of(
                new Gift("Perfume","flower fragrance",35000)
        ));
        System.out.println(person);
    }

}
