public class squarerootbs{
    public static void main(String[] args) {
        class Solution {
            public boolean isPerfectSquare(int num) {
                if (num < 2) {
                    return true;
                }
        
                long low = 1;
                long high = num / 2;
        
                while (low <= high) {
                    long mid = low + (high - low) / 2;
                    long square = mid * mid;
        
                    if (square == num) {
                        return true;
                    } else if (square > num) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
        
                return false;
            }
        }
        
    }
}