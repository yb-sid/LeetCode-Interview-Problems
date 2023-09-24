package problems.happy_number;

public class HappyNumber {
    private int squareSum(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            result += digit * digit;
            n = n / 10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        while (true) {
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if (slow == 1) {
                return true;
            }
            if (slow == fast)
                return false;
        }
    }
}
