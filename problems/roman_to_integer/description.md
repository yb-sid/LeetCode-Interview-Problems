# Roman to Integer Conversion

## Overview
The goal is to convert a Roman numeral string into an integer. We use a HashMap to store the values of Roman numerals and iterate through the string to calculate the final integer value.

## Optimized Approach
1. **HashMap for Roman Values**: We create a HashMap called `values` to map each Roman numeral character to its integer value. This simplifies value lookup.

2. **Iterating from Right to Left**: We iterate through the Roman numeral string from right to left (starting from the last character). This allows us to compare the current character with the previous character, which is essential for handling subtraction cases.

3. **Tracking Next Value**: We maintain a variable called `next` to keep track of the value of the next character during the iteration. This is used to determine whether to add or subtract the current character's value.

4. **Adding or Subtracting Values**:
   - If the current character's value (`curr`) is less than `next` then subtract `curr` from result
   - Else add the value of `curr` to result.

