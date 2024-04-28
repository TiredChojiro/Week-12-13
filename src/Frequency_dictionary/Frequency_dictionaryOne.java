package Frequency_dictionary;
import java.util.HashMap;
import java.util.Map;

public class Frequency_dictionaryOne {

    private Map<String, Integer> frequencyMap;

    public Frequency_dictionaryOne() {
        frequencyMap = new HashMap<>();
    }

    public void addText(String text) {
        text = text.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < text.length() - 1; i++) {
            String pair = text.substring(i, i + 2);
            frequencyMap.put(pair, frequencyMap.getOrDefault(pair, 0) + 1);
        }
    }

    public Map<String, Integer> getFrequencyMap() {
        return frequencyMap;
    }
}
