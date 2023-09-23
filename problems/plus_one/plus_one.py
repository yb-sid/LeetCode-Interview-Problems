from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        for idx in range(len(digits) - 1, -1, -1):
            curr = digits[idx]
            plus = curr + carry
            digits[idx] = plus % 10
            carry = plus // 10

        if carry == 1:
            digits.insert(0, 1)
        return digits
