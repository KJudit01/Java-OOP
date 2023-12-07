public class Main {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer("James", 40, 20, 30);
        Boxer boxer2 = new Boxer("John", 35, 30, 30);
        System.out.println("The boxer1's information:");
        System.out.println(boxer1);
        System.out.println("\nThe boxer2's information:");
        System.out.println(boxer2);
        System.out.println("\nThe fight between Boxer1 and Boxer2:");
        boxer1.fight(boxer2);
        System.out.println("\nThe number of wins of Boxer1: " + boxer1.wins);
        System.out.println("\nThe number of wins of Boxer2: " + boxer2.wins);
    }
}
