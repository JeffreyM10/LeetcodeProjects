class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0){
            int lastDigit = x % 10; //storing the last digit
            x = x/10;              //removing the last digit

            if (rev > (Math.pow(2,31) / 10) || (rev == (Math.pow(2,31) / 10) && lastDigit > 7)) { //over contraint
                return 0;  
            }
            if (rev < (Math.pow(-2,31) / 10) || (rev == (Math.pow(-2,31) / 10) && lastDigit < -8)) { //under contraint
                return 0;  
            }
                rev = rev * 10 + lastDigit; //add the last digit into the reversed integer
            }
        return rev;          
    }
}
