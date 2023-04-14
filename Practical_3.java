public class Practical_3 {
    public static void main(String[] args) {        
        System.out.println("216090307039");
        int number = Integer.parseInt(System.console().readLine("Enter a number: "));

        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10; 
            reverse = reverse + number % 10; 
            number = number / 10; 
        }
        System.out.println("Reverse of entered number is " + reverse);
    }
}
