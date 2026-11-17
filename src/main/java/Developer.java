public class Developer extends Person {
    String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public void play() {
        System.out.println("This is my version of playing...");
        System.out.println("GTA");
    }


}
