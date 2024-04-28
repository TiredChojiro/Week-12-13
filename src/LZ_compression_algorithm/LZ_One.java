package LZ_compression_algorithm;
import java.util.HashMap;

public class LZ_One {

    public static String PairwiseExpressionCodes(String input) {

        HashMap<String, Integer> dictionary = new HashMap<>();
        int nextCode = 256;

        StringBuilder com = new StringBuilder();
        StringBuilder currentSub= new StringBuilder();

        for (char c : input.toCharArray()) {
            currentSub.append(c);
            if (!dictionary.containsKey(currentSub.toString())) {
                dictionary.put(currentSub.toString(), nextCode++);
                currentSub.deleteCharAt(currentSub.length() - 1);
                com.append(dictionary.get(currentSub.toString())).append(" ");
                currentSub = new StringBuilder(Character.toString(c));
            }
        }

        if (currentSub.length() > 0) {
            com.append(dictionary.get(currentSub.toString())).append(" ");
        }

        return com.toString();
    }
}
