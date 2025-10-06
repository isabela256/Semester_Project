import java.util.*;

// calculates word statistics
public class StatisticsCalculator {
    private List<String> words;
    
    public StatisticsCalculator(List<String> w) {
        words = w;
    }
    
    // count total words
    public int countWords() {
        return words.size();
    }
    
    // count unique words
    public int countUnique() {
        Set<String> unique = new HashSet<>(words);
        return unique.size();
    }
    
    // count how many times each word appears
    public Map<String, Integer> countFrequency() {
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            if (freq.containsKey(word)) {
                freq.put(word, freq.get(word) + 1);
            } else {
                freq.put(word, 1);
            }
        }
        return freq;
    }
    
    // show statistics
    public void show() {
        System.out.println("\nStatistics:");
        System.out.println("Total words: " + countWords());
        System.out.println("Unique words: " + countUnique());
    }
}
