package Frequency_dictionary;
import java.util.HashMap;
import java.util.Map;

public class Frequency_dictionaryTwo {

    private Map<String, Integer> frequencyMap;

    public Frequency_dictionaryTwo() {
        frequencyMap = new HashMap<>();
    }

    public void addText(String text) {
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
    }

    public Map<String, Integer> getFrequencyMap() {
        return frequencyMap;
    }
}
