public class Practical_10 {
    final int MAX_NUM = 100;
    final double PI = 3.14159;

    public final void printMessage() {
        System.out.println("This is a final method.");
    }

    public static void main(String[] args) {        
        System.out.println("216090307039");

        Practical_10 obj = new Practical_10();
        
        System.out.println("MAX_NUM: " + obj.MAX_NUM);
        System.out.println("PI: " + obj.PI);
        obj.printMessage();
    }
}
