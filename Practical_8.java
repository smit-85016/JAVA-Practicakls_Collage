import java.util.Scanner;

class rectangle{
    private float height, width;
    public Scanner sc = new Scanner(System.in);

    rectangle(){
        this(0,0);
    }

    rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    void display(){
        System.out.println("width of rectangle is: " + width );
        System.out.println("height of rectangle is: " + height);
    }
    
}

public class Practical_8 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.display();
        r2.display();
    }
}
