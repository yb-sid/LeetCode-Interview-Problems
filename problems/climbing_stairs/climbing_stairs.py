memo = {}


class Solution:
    def climbStairs(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1:
            return 1
        if n == 2:
            return 2
        key = f"{n}++"
        if key in memo:
            return memo[key]

        answer = self.climbStairs(n - 1) + self.climbStairs(n - 2)
        memo[key] = answer
        return memo[key]
