package problems.power_of_three;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        // log3(n) == xlog3(3) , log3(n) = log(n) / log(3)
        if (n <= 0)
            return false;

        double log3n = Math.log(n) / Math.log(3);

        return Math.abs(log3n - Math.round(log3n)) < 1e-10;
    }
}
