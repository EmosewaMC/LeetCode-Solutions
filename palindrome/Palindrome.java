package palindrome;

public class Palindrome{
    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        int i = 0;
        while (i < number.length() / 2) {
            if(number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}