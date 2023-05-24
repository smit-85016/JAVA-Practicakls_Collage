// First interface
interface brand {
    void B();
}

// Second interface
interface model {
    void M();
}

// Class implementing both interfaces
class car implements brand, model {
    @Override
    public void B() {
        System.out.println("Bradn of the car is BENTLEY" );
    }
    
    @Override
    public void M() {
        System.out.println("Model of the car is CONTINTAL GT V8" );
    }
}

public class Practical_19 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        car obj = new car();
        obj.B();
        obj.M();
    }
}
