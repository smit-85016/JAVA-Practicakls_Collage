class SBI extends bank{
    int getROI() { return 7 ; }
}

class ICICI extends bank{
    int getROI() { return 8;}
}

class HDFC extends bank{
    int getROI() { return 9; }
}

class bank{
    int getROI() { return 0; }
}


public class Practical_17 {
    public static void main(String[] args) {
        System.out.println("216090307039");

        bank b;
        b=new SBI();
        System.out.println("ROI of SBI");
        System.out.println(b.getROI());

        b=new ICICI();
        System.out.println("ROI of ICICI");
        System.out.println(b.getROI());

        b=new HDFC();
        System.out.println("ROI of HDFC");
        System.out.println(b.getROI());
        
    }
}
