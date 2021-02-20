package strings;


//28. Implement strStr()

/**
 * Implement strStr().
 * <p>
 * Return the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 */
public class StrStr {
    public int strStr(String haystack, String needle) {

        int i = Integer.MIN_VALUE;
        if (needle.length() == 0 || (haystack.length() == needle.length() && haystack.equals(needle))) return 0;
        return haystack.indexOf(needle) >= 0 ? i = haystack.indexOf(needle) : -1;
    }
}
