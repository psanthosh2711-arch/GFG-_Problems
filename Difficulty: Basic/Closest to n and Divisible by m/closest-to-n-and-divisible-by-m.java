class Solution {
    static int closestNumber(int n, int m) {
        // code here
        Scanner sc=new Scanner(System.in);
        int q,d1,d2;
        int val;
        if(n==0){
            return m;
        }
        else if(n>0 && m>0){
            q=n/m;
            d1=Math.abs(n-(q*m));
            d2=Math.abs(n-(q+1)*m);
            if(d1<d2){
                val=q*m;
                return val;
            }
            else{
                val=(q+1)*m;
                return val;
            }
        }
        else if(n>0 && m<0){
            q=Math.abs(n)/Math.abs(m);
            d1=Math.abs(Math.abs(n)-(q*Math.abs(m)));
            d2=Math.abs(Math.abs(n)-(q+1)*Math.abs(m));
            if(d1<d2){
                val=q*Math.abs(m);
                return val;
            }
            else{
                val=(q+1)*Math.abs(m);
                return val;
            }
        }
        else{
            q=Math.abs(n)/Math.abs(m);
            d1=Math.abs(Math.abs(n)-(q*Math.abs(m)));
            d2=Math.abs(Math.abs(n)-(q+1)*Math.abs(m));
            if(d1<d2){
                val=q*Math.abs(m);
                return -val;
            }
            else{
                val=(q+1)*Math.abs(m);
                return -val;
            }
            
        }
    }
}