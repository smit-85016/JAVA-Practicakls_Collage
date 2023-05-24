class car {

    int topSpeed;
    String name;

    public car(String name, int topSpeed) {
        this.topSpeed = topSpeed;
        this.name = name;
    }

    public String toString() {
        return  "topSpeed=" + topSpeed +
                ", name='" +name + '\'';
    }
}

public class Practical_18 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        car Practical_181 = new car( "Ferrari", 200);
        car Practical_182 = new car("Lamborghini", 150);
        car Practical_183 = new car("Porsche", 100);
        car Practical_184 = new car("Audi", 50);
        car Practical_185 = new car( "Volkswagen", 15);

        System.out.println(Practical_181);
        System.out.println(Practical_182);
        System.out.println(Practical_183);
        System.out.println(Practical_184);
        System.out.println(Practical_185);
    }
}
