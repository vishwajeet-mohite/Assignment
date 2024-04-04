import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();

     
        String[] words = input.split("\\s+");

        
        for (String word : words) {
            word = word.toLowerCase(); 
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        
        System.out.println("Word count in the string:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
        int totalWords = words.length;
        System.out.println("Total number of words: " + totalWords);
    }
}