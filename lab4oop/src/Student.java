import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Student implements Comparable<Student>{
    public String name;
    public String surname;
    public int speciality;
    public int acknowlegment;
    public int scholarship = 0;
    public int money;
    public int happy;

    public Student (String nm, String surnm, int spec) {
        name = nm;
        surname = surnm;
        speciality = spec;
        acknowlegment = new Random().nextInt(3);
        money = new Random().nextInt(5000);
        if (acknowlegment > 88) {
            scholarship = 1900;
        } else if (acknowlegment > 80) {
            scholarship = 1300;
        } else {
            scholarship = 0;
        }
        happy = Math.round(100 - acknowlegment + money / 100 + scholarship / 100);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality=" + speciality +
                ", acknowlegment=" + acknowlegment +
                '}';
    }

    public void study(){
        int dacknowlegment = new Random().nextInt(15);
        this.acknowlegment += dacknowlegment;
        happy -= dacknowlegment*2;
        System.out.println("Your acknowlegment has increased by " + dacknowlegment);
        System.out.println("Your happiness has decreased by " + dacknowlegment*2);
    }
    public void drinkBeer(){
        int dacknowlegment = new Random().nextInt(10);
        this.acknowlegment -= dacknowlegment;
        int dhappy = 5 + new Random().nextInt(10);
        happy += dhappy;
        money -= dhappy*10;
        System.out.println("Your acknowlegment has decreased by " + dacknowlegment);
        System.out.println("Your happiness has increased by " + dacknowlegment);
    }
    public void monthEnd(){
        if (this.acknowlegment > 80){
            scholarship = 1300;
        }else if(this.acknowlegment > 88){
            scholarship = 1900;
        }else{
            scholarship = 0;
        }
        money += scholarship;
    }
    public void stat(){
        System.out.println(name + " study on " + speciality + " speciality");
        System.out.println(name + "'s acknowlegment = " + this.acknowlegment);
        System.out.println(name + " have " + money + " money");
        System.out.println("Happy = " + happy + "%");
        System.out.println(name + " gets " + scholarship + " scholarship");
    }
    public void help(){
        System.out.println("You are student!");
        System.out.println("You can: drink or study");
        System.out.println("Just print \"drink\" or \"study\"");
        System.out.println("Also you can see your stat by command \"stat\"");
        System.out.println("To see this window enter \"help\"");

    }

    public int getAcknowlegment(){
        return this.acknowlegment;
    }
    public int getMoney(){
        return this.money;
    }
    public String getSurname() { return this.surname; }
    public String getName() { return this.name; }

    public int compareTo(Student student) {
        int nameCompareResult = surname.compareTo(student.surname);
        return nameCompareResult != 0 ? nameCompareResult : name.compareTo(student.name);
    }

    /*public int compareTo(Student compareStudent) {

        int compareAcknowlegment = (compareStudent).getAcknowlegment();

        //ascending order
        return this.acknowlegment - compareAcknowlegment;

        //descending order
        //return compareQuantity - this.quantity;

    }



    public static Comparator<Student> StudentmoneyComparator
            = new Comparator<Student>() {

        public int compare(Student st1, Student st2) {

            Integer mn1 = st1.getMoney();
            Integer mn2 = st2.getMoney();

            //ascending order
            //return mn1.compareTo(mn2);

            //descending order
            return mn2.compareTo(mn1);
        }

    };*/

}


