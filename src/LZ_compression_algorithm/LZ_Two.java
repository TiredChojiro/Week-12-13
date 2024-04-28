package LZ_compression_algorithm;
import java.util.HashMap;

public class LZ_Two {

    public static String CodesForWords(String input) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        int nextCode = 1; // Следующий доступный код

        StringBuilder com = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (String word : input.split("\\s+")) {
            currentWord.append(word);
            if (!dictionary.containsKey(currentWord.toString())) {
                dictionary.put(currentWord.toString(), nextCode++);
                currentWord.delete(0, currentWord.length());
                com.append(dictionary.get(currentWord.toString())).append(" ");
            }
            currentWord.append(" ");
        }

        return com.toString();
    }

}
