class Solution {
public:
    bool isPalindrome(int x) {
        int num = x;
        long long rev = 0;
        
        while(num > 0){
            int unit = num%10;
            rev = (10*rev)+unit;
            num=num/10;
        }
        
        return rev == x;
    }
};