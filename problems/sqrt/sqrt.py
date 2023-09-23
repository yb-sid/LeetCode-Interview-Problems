class Solution:
    def mySqrt(self, x: int) -> int:
        if x <= 1:
            return x
        lo = 1
        hi = x
        while lo <= hi:
            mid = (lo + hi) // 2
            if mid * mid == x:
                return mid
            elif mid * mid < x:
                lo = mid + 1
            else:
                hi = mid - 1
        print(f"lo = {lo} and hi = {hi}")
        return hi
