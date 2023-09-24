package problems.pascal_triangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        // Initialize the first row with a single element 1
        result.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previousRow = result.get(i - 1);
            // The first element is always 1
            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }
            // The last element is always 1
            currentRow.add(1);

            result.add(currentRow);
        }
        return result;
    }
}
