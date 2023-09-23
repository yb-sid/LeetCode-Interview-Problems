def two_sum(nums: list[int], target: int):
    map = {}
    for index, value in enumerate(nums):
        current = value
        complement = target - current
        if complement in map:
            return [index, map[complement]]
        map[current] = index

    return []


print(two_sum([2, 7, 11, 15], 9))
