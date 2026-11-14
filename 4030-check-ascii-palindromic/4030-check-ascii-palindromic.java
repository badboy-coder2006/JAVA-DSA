
class Solution {
    public boolean isPalindromic(String s) {
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            int num = (int) s.charAt(i);
            String binary = Integer.toBinaryString(num);

            while (binary.length() < 8) {
                binary = "0" + binary;
            }

            a += binary;
        }

        return isPalindrome(a);
    }

    private boolean isPalindrome(String a) {
        int i = 0;
        int j = a.length() - 1;

        while (i < j) {
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}