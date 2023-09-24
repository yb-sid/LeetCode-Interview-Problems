package problems.number_1_bits;

public class HammingDistance {
    public int hammingWeight(int n) {
        int hammingDist = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                hammingDist += 1;
            }
            n = n >> 1;
        }
        return hammingDist;
    }
}
