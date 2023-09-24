import math


class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n <= 0:
            return False

        log3n = math.log(n, 3)
        epsilon = 1e-10
        return abs(log3n - round(log3n)) < epsilon
