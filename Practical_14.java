class animal{
    void display(){
        System.out.println("Animal is Eating!");
    }
}

class dog extends animal{
    void display1(){
        System.out.println("Dog is  Barking!");
    }
}

public class Practical_14 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        dog d=new dog();
        d.display();
        d.display1();
    }
}
