import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Wordakshari! Enter the first word:");
        String previousWord = scanner.nextLine().toLowerCase();
        
        while (true) {
            System.out.println("Enter your word:");
            String currentWord = scanner.nextLine().toLowerCase();
            
            if (currentWord.isEmpty()) {
                System.out.println("You entered an empty word. Game over!");
                break;
            }
            
            char lastChar = previousWord.charAt(previousWord.length() - 1);
            char firstChar = currentWord.charAt(0);
            
            if (lastChar == firstChar) {
                System.out.println("Correct!");
                previousWord = currentWord;
            } else {
                System.out.println("Incorrect. You lose!");
                break;
            }
        }
        
        scanner.close();
    }
}