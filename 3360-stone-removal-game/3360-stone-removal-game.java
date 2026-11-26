class Solution {
    public boolean canAliceWin(int n) {
       int num = 10;
       boolean r = true;
       while(n >= num){
        n = n - num;
        num--;
        r = !r;
       }
       return !r;
    }
}