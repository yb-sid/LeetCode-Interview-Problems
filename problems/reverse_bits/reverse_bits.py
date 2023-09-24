class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0
        for i in range(32):
            current_bit = n & 1
            result = result << 1 | current_bit
            n = n >> 1
        return result
