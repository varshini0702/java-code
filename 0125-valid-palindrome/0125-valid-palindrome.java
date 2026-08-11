class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right &&
                   !((s.charAt(left) >= 'A' && s.charAt(left) <= 'Z') ||
                     (s.charAt(left) >= 'a' && s.charAt(left) <= 'z') ||
                     (s.charAt(left) >= '0' && s.charAt(left) <= '9'))) {
                left++;
            }

            while (left < right &&
                   !((s.charAt(right) >= 'A' && s.charAt(right) <= 'Z') ||
                     (s.charAt(right) >= 'a' && s.charAt(right) <= 'z') ||
                     (s.charAt(right) >= '0' && s.charAt(right) <= '9'))) {
                right--;
            }

            char a = s.charAt(left);
            char b = s.charAt(right);

            if (a >= 'A' && a <= 'Z')
                a = (char)(a + 32);

            if (b >= 'A' && b <= 'Z')
                b = (char)(b + 32);

            if (a != b)
                return false;

            left++;
            right--;
        }

        return true;
    }
}