class Solution {
    public int arrangeCoins(int n) {
        long num = n;
        return (int)((-1 + Math.sqrt(1 + 8 * num)) / 2);
    }
}