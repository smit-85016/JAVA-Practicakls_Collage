public class Practical_13 {
    public static void main(String[] args) {
        System.out.println("216090307039"); 

        String str = "Hello, World!";
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);
        
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);

        String formattedString = String.format("Formatted: %s", str);
        System.out.println(formattedString);

        int length = str.length();
        System.out.println("Length: " + length);

        String[] words = str.split(", ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
