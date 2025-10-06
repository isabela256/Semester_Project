import java.util.*;

// Milestone 1
// Team: Derek Maxim, Kobichdi Ezeokoli, Isabela Arteaga
public class Main {
    public static void main(String[] args) {
        System.out.println("Milestone 1 - News Preprocessing");
        System.out.println("Team: Derek, Kobichdi, Isabela");
        
        // file locations
        String stopFile = "data/resources/stopwords.txt";
        String newsFolder = "data/news_articles";
        
        // step 1: load stop words
        TextPreprocessor prep = new TextPreprocessor();
        prep.loadStopWords(stopFile);
        
        // step 2: process articles
        List<String> words = prep.processDirectory(newsFolder);
        
        // step 3: calculate stats
        StatisticsCalculator stats = new StatisticsCalculator(words);
        stats.show();
        
        // step 4: rank words
        Map<String, Integer> freq = stats.countFrequency();
        WordFrequencyRanker ranker = new WordFrequencyRanker(freq);
        ranker.showTop(10);
        
        System.out.println("\nDone!");
    }
}
