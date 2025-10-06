import java.io.*;
import java.util.*;

// removes stop words from text
public class TextPreprocessor {
    private Set<String> stopWords;
    
    public TextPreprocessor() {
        stopWords = new HashSet<>();
    }
    
    // load stop words from file
    public void loadStopWords(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                stopWords.add(line.toLowerCase());
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    // read file and remove stop words
    public List<String> processFile(String file) {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String clean = line.toLowerCase().replaceAll("[^a-z ]", "");
                String[] words = clean.split(" ");
                for (String w : words) {
                    if (!w.isEmpty() && !stopWords.contains(w)) {
                        result.add(w);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return result;
    }
    
    // process all files in directory
    public List<String> processDirectory(String path) {
        List<String> all = new ArrayList<>();
        File folder = new File(path);
        File[] files = folder.listFiles();
        for (File f : files) {
            if (f.getName().endsWith(".txt")) {
                all.addAll(processFile(f.getPath()));
            }
        }
        return all;
    }
}
