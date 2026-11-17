public class Musician extends Person{
    String instrument;

    public Musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    @Override
    public void play() {
        System.out.println("I'm playing a sonata.");
    }

    @Override
    public String toString() {
         return "Musician named " + this.name + " who plays the " + this.instrument;
    }
}
