import java.util.*;

public class LogicTest {
    private static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!anagrams.containsKey(sortedWord)) {
                anagrams.put(sortedWord, new ArrayList<>());
            }
            anagrams.get(sortedWord).add(word);
        }

        return new ArrayList<>(anagrams.values());
    }
    private static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] words = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        List<List<String>> anagrams = groupAnagrams(words);
        System.out.println(anagrams);
    }
}


