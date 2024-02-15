public class prac13 {

    public static void main(String[] args) {
        String myString = "Hello, World!";

        char firstChar = myString.charAt(0);
        System.out.println("First character: " + firstChar);

        boolean hasWorld = myString.contains("World"); 
        System.out.println("Contains 'World'? " + hasWorld);

        String formattedString = String.format("Greeting: %s", myString);
        System.out.println("Formatted string: " + formattedString);

        int stringLength = myString.length(); 
        System.out.println("String length: " + stringLength);

        String[] words = myString.split(",");
        System.out.println("Split by comma: " + java.util.Arrays.toString(words));
    }
}
