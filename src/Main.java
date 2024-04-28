import static LZ_compression_algorithm.LZ_One.PairwiseExpressionCodes;
import static LZ_compression_algorithm.LZ_Two.CodesForWords;

public class Main {
    public static void main(String[] args) {
        String input = "This is good";
        String compressed = PairwiseExpressionCodes(input);
        System.out.println("Original size: " + input.length());
        System.out.println("Compressed size: " + compressed.length());
        double compressionRatio = (double) input.length() / compressed.length();
        System.out.println("Compression ratio: " + compressionRatio);

        String inputTwo = "the quick brown fox jumps over the lazy dog";
        String compressedTwo = CodesForWords(inputTwo);
        System.out.println("Original size: " + inputTwo.length());
        System.out.println("Compressed size: " + compressedTwo.length());
        double compressionRatioTwo = (double) inputTwo.length() / compressedTwo.length();
        System.out.println("Compression ratio: " + compressionRatioTwo);
    }
}