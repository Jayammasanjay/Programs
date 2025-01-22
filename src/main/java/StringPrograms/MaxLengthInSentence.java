package StringPrograms;

public class MaxLengthInSentence {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        int longestLength = longestWord(input);
        System.out.println("Length of the longest word: " + longestLength);
    }

    public static int longestWord(String s) {
        String[] arr = s.split(" ");
        int maxLength = 0;

        for (String word : arr) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        return maxLength;
    }

}



