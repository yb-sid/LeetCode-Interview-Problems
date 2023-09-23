package problems.sqrt;

public class Sqrt {

    public int sqrt(int x) {
        if (x <= 1)
            return x;

        int lo = 1;
        int hi = x;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int sq = mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return hi;
    }

}
