class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        columnNumber = 0
        powerIndex = 0

        for ch in reversed(columnTitle):
            charValue = ord(ch) - ord("A") + 1
            columnNumber += charValue * 26**powerIndex
            powerIndex += 1
        return columnNumber
