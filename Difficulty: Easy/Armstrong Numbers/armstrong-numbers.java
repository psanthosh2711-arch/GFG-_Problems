class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int a=n;
        int d=0;
        while(n>0){
            d=d+((int)Math.pow(n%10,3));
            n=n/10;
        }
        if(d==a){
            return true;
        }
        else{
            return false;
        }
    }
}