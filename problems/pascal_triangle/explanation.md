# Pascal's Triangle

## Overview
Pascal's Triangle is a triangular array of numbers in which each number is the sum of the two numbers immediately above it. It is named after the French mathematician Blaise Pascal, although it was known to Chinese mathematicians over 500 years earlier.

## Construction
Pascal's Triangle begins with a single 1 at the top. Each subsequent row is constructed by adding two 1s at the ends of the previous row and filling in the interior numbers by summing the two numbers directly above them. Here's an example of the first few rows of Pascal's Triangle:

         1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1


## Properties and Applications
- **Binomial Coefficients:** Each number in Pascal's Triangle corresponds to a binomial coefficient, often denoted as "n choose k," representing the number of ways to choose k items from a set of n distinct items without regard to order. For example, the number 6 in the fifth row corresponds to "5 choose 2," which is the number of ways to choose 2 items from a set of 5.

- **Combinatorial Identities:** Pascal's Triangle is a source of various combinatorial identities and relationships, such as the binomial theorem and Vandermonde's identity.

- **Probability and Statistics:** Pascal's Triangle has applications in probability and statistics, particularly in probability distributions and the calculation of probabilities.

## Pascal's Triangle Formula
The formula for calculating the values in Pascal's Triangle is based on binomial coefficients. Each value in row `n` and position `k` (0-based) can be calculated using the formula:

where `C(n, k)` is the binomial coefficient corresponding to the value at row `n` and position `k`.

## Generating Pascal's Triangle Programmatically
You can generate Pascal's Triangle programmatically using nested loops to calculate the values row by row or by implementing a recursive or iterative algorithm. Each row starts with a 1 and is constructed based on the previous row.
