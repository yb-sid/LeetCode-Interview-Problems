package problems.plus_one;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        // msb = digits[0]
        int carry = 1;
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] res = new int[n + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, n);
            return res;
        }
        return digits;
    }

}
