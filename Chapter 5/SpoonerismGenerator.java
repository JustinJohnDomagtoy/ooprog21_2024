import java.util.Scanner;

public class SpoonerismGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1: ");
        String word1 = scanner.nextLine();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine();

        String result = generateSpoonerism(word1, word2);
        System.out.println(result);

        scanner.close();
    }

    public static String generateSpoonerism(String word1, String word2) {
        String spoonerized1 = spoonerize(word1);
        String spoonerized2 = spoonerize(word2);

        if (spoonerized1.equals("invalid") || spoonerized2.equals("invalid")) {
            return word1 + " and " + word2 + " are not good words to spoonerize.";
        }
        return word1 + " and " + word2 + " spoonerized are " + spoonerized1 + " " + spoonerized2;
    }

    public static String spoonerize(String word) {
        int vowelIndex = findFirstVowelIndex(word);

        if (vowelIndex == -1 || vowelIndex == 0) {
            return "invalid"; 
        }

        String consonants = word.substring(0, vowelIndex);
        String restOfWord = word.substring(vowelIndex);

        return restOfWord + consonants;
    }

    public static int findFirstVowelIndex(String word) {
        String vowels = "aeiou";

        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;  
    }
}
