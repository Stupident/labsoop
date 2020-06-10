
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MySet mySet = new MySet();
        for(int i=0; i<8; i++) {
            mySet.add(new Electronics("Sony", 2500+i, 200));
            mySet.add(new Electronics("Sony", 2300+i, 2000));
        }
        MySet myset2 = new MySet(new Electronics("Apple", 20, 230));

        /*Iterator<Electronics> iterator = mySet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/


        for (Electronics electronics : mySet) {
            System.out.println(electronics.toString());
        }
        System.out.println(mySet.contains(new Electronics("Sony", 2500, 200)));

        System.out.println("Done!");
    }
}