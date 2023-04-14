class student{
    private long eno;
    private String name;
    private static int no_student=0;

    student(long eno,String name){
        this.eno=eno;
        this.name=name;
        no_student++;
    }

    void display() {
        System.out.println("Student enrollment number: " + eno);
        System.out.println("Student name: " + name);
        System.out.println("Student total number of students: " + no_student);
    }
}
public class Practical_9 {
    public static void main(String[] args) {
        System.out.println("216090307039");
        student s1=new student(216090307039l,"smit");
        s1.display();
        student s2=new student(216090307039l,"smit");
        s2.display();
        student s3=new student(216090307039l,"smit");
        s3.display();
    }

}
