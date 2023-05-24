class animal{
    void eat(){
        System.out.println("Animal is Eating!");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("cat is meowing!");
    }
}
class dog extends cat{
    void bark(){
        System.out.println("Dog is  Barking!");
    }
}

public class Practical_15 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        dog d=new dog();
        d.bark();
        d.meow();
        d.eat();
    }
}
