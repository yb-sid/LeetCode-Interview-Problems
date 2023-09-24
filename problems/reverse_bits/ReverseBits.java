package problems.reverse_bits;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int currentBit = n & 1; // & with 1 results in either 0 or 1
            result = result << 1 | currentBit; // left shift makes place , or add crrent bit
            n = n >> 1;
        }
        return result;
    }
}
