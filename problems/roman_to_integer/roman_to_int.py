table = {
    "I": 1,
    "V": 5,
    "X": 10,
    "L": 50,
    "C": 100,
    "D": 500,
    "M": 1000,
}


def romanToInt(s: str) -> int:
    next = 0
    result = 0
    for curr in reversed(s):
        value = table[curr]
        # print(f"curr = {curr} and value = {value}")
        if value < next:
            result -= value
        else:
            result += value
        next = value
    return result


print(romanToInt("III"))
