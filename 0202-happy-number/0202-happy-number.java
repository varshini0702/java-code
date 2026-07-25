class Solution {
    public boolean isHappy(int n) {
        boolean[] visited = new boolean[1000];

        while (n != 1) {

            if (n < 1000 && visited[n]) {
                return false;
            }

            if (n < 1000) {
                visited[n] = true;
            }

            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }
}