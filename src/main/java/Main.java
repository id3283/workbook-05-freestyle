import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> peeps = new ArrayList<>();

        Person person = new Person("Dave", 58);
        peeps.add(person);

        Person hiba = new Musician("Hiba", 23, "recorder");
        peeps.add(hiba);

        Person jo = new Developer("Josiah", 23, "Java");
        peeps.add(jo);

        for (Person p : peeps) {
//            if(p instanceof Developer) {
            if(p.getClass() == Developer.class) {
                Developer d = (Developer) p;

                System.out.println(d);
                d.code();
            }
            else {
                p.play();
            }

        }
    }
}
