from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        unq_idx = 0
        for idx in range(1, len(nums)):
            if nums[idx] != nums[unq_idx]:
                unq_idx += 1
                nums[unq_idx] = nums[idx]
        return unq_idx + 1
