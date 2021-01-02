package strings;

//1528. Shuffle String

/**
 * Given a string s and an integer array indices of the same length.
 * <p>
 * The string s will be shuffled such that the character at
 * the ith position moves to indices[i] in the shuffled string.
 * <p>
 * Return the shuffled string.
 */
public class RestoreString {

    public static String restoreString(String s, int[] indices) {
        String[] str = s.split("");
        String[] output = new String[s.length()];
        for (int i = 0; i < indices.length; i++) {
            output[indices[i]] = str[i];
        }

        return String.join("", output);
    }
}
