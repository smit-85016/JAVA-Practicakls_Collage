class rectangle{
    private float height,width;
    rectangle(float height,float width){
        this.height=height;
        this.width=width;
    }

    void display(){
        System.out.println("height of the rectangle is: " + height);
        System.out.println(" width of the rectangle is: " + width);
    }

}

public class Practical_7 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        rectangle r1=new rectangle(10,20);
        rectangle r2=new rectangle(20,30);
        r1.display();
        r2.display();
    }
}
