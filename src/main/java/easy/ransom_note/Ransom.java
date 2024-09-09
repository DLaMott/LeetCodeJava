package easy.ransom_note;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ransom {

    //Input: ransomNote = "aa", magazine = "aab"
   // Output: true
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Create a frequency map of characters in the magazine using Streams
        Map<Character, Long> magazineCharCount = magazine.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Check if the ransomNote can be constructed by the magazine
        return ransomNote.chars()
                .mapToObj(c -> (char) c)
                .allMatch(c -> magazineCharCount.getOrDefault(c, 0L) > 0 && magazineCharCount.put(c, magazineCharCount.get(c) - 1) != null);
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

}
