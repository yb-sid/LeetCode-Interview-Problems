package problems.roman_to_integer;

import java.util.Map;
import java.util.HashMap;

class RomanToInteger {
    private Map<Character, Integer> table = new HashMap<>();

    public int romanToInt(String s) {
        init();
        int n = s.length();
        char[] arr = s.toCharArray();
        int result = 0;
        int next = 0;
        for (int i = n - 1; i >= 0; i--) {
            int curr = table.get(arr[i]);
            if (next > curr) {
                result -= curr;
            } else {
                result += curr;
            }
            next = curr;
        }

        return result;
    }

    private void init() {
        table.put('I', 1);
        table.put('V', 5);
        table.put('X', 10);
        table.put('L', 50);
        table.put('C', 100);
        table.put('D', 500);
        table.put('M', 1000);
    }
}