class Solution:
    def hammingWeight(self, n: int) -> int:
        hamming_dist = 0
        for i in range(32):
            if n & 1 == 1:
                hamming_dist += 1
            n = n >> 1
        return hamming_dist
