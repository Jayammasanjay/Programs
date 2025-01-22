package StringPrograms;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);
    }

    public static String findLongestWord(String s) {
        String[] arr = s.split(" ");
        StringBuilder longestWord = new StringBuilder();

        for (String word : arr) {
            if (word.length() > longestWord.length()) {
                longestWord = new StringBuilder(word);
            }
        }

        return longestWord.toString();
    }
}
