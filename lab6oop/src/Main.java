import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println(9219%13);

        Electronics[] electronicsOn = {
                new Fridge("Atom", 3000, 200, 23000),
                new Tv("Vitek", 2200, 450, 82),
                new Microwave("LG", 2500, 800, true),
                new Computer("Apple", 3200, 249, "Kirin 6400K"),
                new Tv("Sony", 1700, 300, 40)
        };

        for (Electronics electronics : electronicsOn) {
            System.out.println(electronics.toString());
        }
        System.out.println();
        Arrays.sort(electronicsOn, Comparator.comparing(Electronics::getPower));

        for (Electronics electronics : electronicsOn) {
            System.out.println(electronics.toString());
        }
        int totalpower = 0;
        for (Electronics electronics : electronicsOn) {
            totalpower += electronics.getPower();
        }
        System.out.println("\n" + "total power: " + totalpower);

        int low = input("low");
        int high = input("high");

        System.out.println("Electronics with EMR between " + low + " and " + high + ":");
        for (Electronics electronics : electronicsOn) {
            if(low <= electronics.getEmr() && electronics.getEmr() <= high){
                System.out.println(electronics.toString());
            }
        }
    }
    public static int input( String whatInput){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter " + whatInput + ": ");
            int inputInt = Integer.parseInt(scanner.next("[0-9]*"));
            return inputInt;
        }catch (Exception e){
            System.out.println("Something gona wrong");
            return input(whatInput);
        }
    }
}
