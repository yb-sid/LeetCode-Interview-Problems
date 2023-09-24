from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        triangle = []
        if numRows == 0:
            return triangle

        triangle.append([1])

        for i in range(1, numRows):
            prevRow = triangle[i - 1]
            currRow = []
            currRow.append(1)
            for j in range(1, i):
                currValue = prevRow[j - 1] + prevRow[j]
                currRow.append(currValue)
            currRow.append(1)
            triangle.append(currRow)
        return triangle
