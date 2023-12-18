package exchange;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Gift> wishList;
    private List<Gift> retrievedGifts;

    public Person(String name, int age, List<Gift> wishList) throws InvalidWishListException {
        //single responsibility principle
        if(wishList == null || wishList.size() < 1){
            throw new InvalidWishListException();
        }
        this.name = name;
        this.age = age;
        this.wishList = wishList;
        this.retrievedGifts = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wishList=" + wishList +
                ", retrievedGifts=" + retrievedGifts +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Gift> getWishList() {
        return wishList;
    }

    public void setWishList(List<Gift> wishList) {
        this.wishList = wishList;
    }

    public List<Gift> getRetrievedGifts() {
        return retrievedGifts;
    }

    public void setRetrievedGifts(List<Gift> retrievedGifts) {
        this.retrievedGifts = retrievedGifts;
    }
}
