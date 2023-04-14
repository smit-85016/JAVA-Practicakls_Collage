import java.util.Scanner;

class student {
    public Scanner sc = new Scanner(System.in);
    private Long eno;
    private String name;

    public void getdata(){
        System.out.println("Enter the Enrollment of the student");
        eno = sc.nextLong();
        System.out.println("Enter the name of the student");
        name = sc.next();
    }
    
    public void display(){
        System.out.println("Enrollment of the student is "+eno);
        System.out.println("Name of the student is "+name);
    }   
}

public class Practical_6 { 
    public static void main(String[] args) {
        System.out.println("216090307039");
        student s1 = new student();
        s1.getdata();
        s1.display();
        student s2 = new student();
        s2.getdata();
        s2.display();
        student s3 = new student();
        s3.getdata();
        s3.display();
    }
}
