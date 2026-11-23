class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int original = x;
        int rev = 0;

        while (x > 0) {
            int r = x % 10;   // Get the last digit
            rev = rev * 10 + r; // Build the reversed number
            x = x / 10;       // Remove the last digit
        }

        return original == rev;
    }
}
  