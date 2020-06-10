import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class lab4oop {
    public static void main(String[] args){
        Student[] group = {
                new Student("Sasha", "Ivanova", 126),
                new Student("Danya", "Ruby", 123),
                new Student("Herman", "Java", 117),
                new Student("Anton", "Python", 28),
                new Student("Eugene", "Ruby", 123),
        };

        for (Student st : group){
            System.out.println(st);
        }
        System.out.println();

        System.out.println("Sorted by surname, then by name");
        Arrays.sort(group, Comparator.comparing(Student::getSurname).thenComparing(Student::getName));
        for (Student st : group){
            System.out.println(st);
        }
        System.out.println();

        System.out.println("Sorted by acknowlegment, then by name");
        Arrays.sort(group, Comparator.comparing(Student::getAcknowlegment).thenComparing(Student::getName));
        for (Student st : group){
            System.out.println(st);
        }

        /*Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        while(!command.equals("stop")){
            if(command.equals("drink")) {
                vova.drinkBeer();
            }else if(command.equals("stat")){
                vova.stat();
            }else if(command.equals("help")){
                vova.help();
            }else if(command.equals("study")){
            vova.study();
            }else if(command.equals("End of month")){
            vova.monthEnd();
            }
            command = scan.nextLine();
        }*/

    }
}
