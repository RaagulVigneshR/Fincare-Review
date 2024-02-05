import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Review1 {

    public static List<String> L1(List<String> data) {
        List<String> result = new ArrayList<>();
        for (String item : data) {
            if (isVowel(item.charAt(0))) {
                result.add(item);
            }
        }
        return result;
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return "aeiou".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Words: ");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " Words:");
        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            words.add(input);
        }
        List<String> vowelWords = L1(words);
        System.out.println(vowelWords);
    }
}