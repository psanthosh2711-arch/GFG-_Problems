class Solution {
    int c=1;
    public void printTillN(int n) {
        // code here
        if(c==n+1){
            return;
        }
        else{
            System.out.print(c+" ");
            c++;
            printTillN(n);
            
        }
    }
}