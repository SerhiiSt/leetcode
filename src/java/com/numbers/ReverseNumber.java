package numbers;

//7. Reverse Integer

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Note:
 * Assume we are dealing with an environment that could only
 * store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem,
 * assume that your function returns 0
 * when the reversed integer overflows.
 */
public class ReverseNumber {
    //  static   public int reverse(int x) {
//        int reverse =0;
//        while(x !=0){
//            reverse = reverse * 10;
//            reverse = reverse + x%10;
//            x /=10;
//        }
//        return reverse;
//    }
    static public int reverseNumber(int x) {
        int reverse = 0;
        while (x != 0) {
            try {
                reverse = Math.multiplyExact(reverse, 10);
                reverse = Math.addExact(reverse, x % 10);
                x /= 10;
            } catch (ArithmeticException e) {
                reverse = 0;
                break;
            }
        }
        return reverse;
    }
}
