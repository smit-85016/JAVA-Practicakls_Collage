public class Practical_5 {
    public static void main(String[] args) {        
        System.out.println("216090307039");
        int n = Integer.parseInt(System.console().readLine("Enter a number: "));
        int count = 0;
        int number = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
