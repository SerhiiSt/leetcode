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

    public static String restoreString2(String s, int[] indices) {
        char[] crs = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            crs[indices[i]] = c;
        }
        return String.valueOf(crs);
    }

    public static String restoreString3(String s, int[] indices) {
        char[] crs = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            crs[indices[i]] = s.charAt(i);
        }
        return String.valueOf(crs);
    }

}
