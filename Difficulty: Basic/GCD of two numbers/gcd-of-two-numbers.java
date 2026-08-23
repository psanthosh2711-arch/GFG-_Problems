class Solution {
    public static int gcd(int a, int b) {
        // code here
       /* for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 0;*/
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            return b;
            
        }
        else{
            return a;
        }
    }
}
