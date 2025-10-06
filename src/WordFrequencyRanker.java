import java.util.*;

// ranks words by frequency
public class WordFrequencyRanker {
    private Map<String, Integer> freq;
    
    public WordFrequencyRanker(Map<String, Integer> f) {
        freq = f;
    }
    
    // sort words by count
    public List<Map.Entry<String, Integer>> sort() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(freq.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        return list;
    }
    
    // show top words
    public void showTop(int num) {
        List<Map.Entry<String, Integer>> sorted = sort();
        System.out.println("\nTop " + num + " words:");
        for (int i = 0; i < num && i < sorted.size(); i++) {
            System.out.println((i+1) + ". " + sorted.get(i).getKey() + " (" + sorted.get(i).getValue() + ")");
        }
    }
}
