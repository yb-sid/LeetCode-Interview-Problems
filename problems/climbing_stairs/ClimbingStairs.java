package problems.climbing_stairs;

import java.util.Map;
import java.util.HashMap;

public class ClimbingStairs {
    private Map<String, Integer> memo = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        String key = String.valueOf(n) + "++";
        if (memo.containsKey(key))
            return memo.get(key);

        int answer = climbStairs(n - 1) + climbStairs(n - 2);
        memo.put(key, answer);
        return memo.get(key);
    }
}
