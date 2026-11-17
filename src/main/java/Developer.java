public class Developer extends Person {
    String programmingLanguage;

    public Developer(String name, int age, String programmingLanguage) {
        super(name, age);
        this.programmingLanguage = programmingLanguage;
    }

    public void play() {
        System.out.print("This is my version of playing...");
        System.out.println("GTA");
    }

    public void code() {
        System.out.println("Pass the monster, I'm coding away...");
    }

    @Override
    public String toString() {
        return "Developer named: " + this.name + " age: " + this.age + " dev language: " + this.programmingLanguage;
    }
}
