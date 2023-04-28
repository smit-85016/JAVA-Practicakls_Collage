public class Practical_12 {
    private String name;
    private int age;

    public Practical_12() {
        this.name = "Null"; 
        this.age = 0;
    }

    public Practical_12(String name) {
        this.name = name;
        this.age = 0;
    }

    public Practical_12(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        System.out.println("216090307039");
        Practical_12 person1 = new Practical_12();
        System.out.println("Detail of person1 : ");
        person1.printDetails();

        Practical_12 person2 = new Practical_12("smit");
        System.out.println("\nDetail of person2 : ");
        person2.printDetails();

        Practical_12 person3 = new Practical_12("shah", 17);
        System.out.println("\nDetail of person3 : ");
        person3.printDetails();
    }
}