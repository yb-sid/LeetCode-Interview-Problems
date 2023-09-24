class Solution:
    def isHappy(self, n: int) -> bool:
        def square_sum(n):
            result = 0
            while n > 0:
                digit = n % 10
                result += digit * digit
                n = n // 10
            return result

        slow = n
        fast = n

        while True:
            slow = square_sum(slow)
            fast = square_sum(square_sum(fast))

            if slow == 1:
                return True
            if slow == fast:
                return False
