class Solution {
    public int reverseBits(int n) {
        int rev = 0;

        for (int i = 0; i < 32; i++) {
            rev = rev * 2;
            if ((n & 1) == 1)
                rev = rev + 1;
            n = n >> 1;
        }

        return rev;
    }
}