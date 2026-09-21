class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        // code here
        int a_len=a.length;
        int b_len=b.length;
        int c_len=c.length;
        int i=0;
        int j=0;
        int k=0;
        int min;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<a_len && j<b_len && k<c_len){
            if(a[i]==b[j] && b[j]==c[k]){
                if(arr.isEmpty()||arr.get(arr.size()-1)!=a[i]){
                    arr.add(a[i]);
                }
                i=i+1;
                j=j+1;
                k=k+1;
            }
            else{
                min=Math.min(a[i],Math.min(b[j],c[k]));
                if(min==a[i]){
                    i=i+1;
                }
                if(min==b[j]){
                    j=j+1;
                }
                if(min==c[k]){
                    k=k+1;
                }
                
            }
        }
        return arr;
    }
}