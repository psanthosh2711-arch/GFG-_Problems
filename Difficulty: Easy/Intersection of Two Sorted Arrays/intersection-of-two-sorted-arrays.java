class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        // code here
        ArrayList<Integer> intersec=new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i!=a.length && j!=b.length){
            if(a[i]==b[j]){
                if(intersec.size()==0){
                    intersec.add(a[i]);
                    i=i+1;
                    j=j+1;
                    k=k+1;
                }
                else if(intersec.get(k-1)!=a[i]){
                    intersec.add(a[i]);
                    i=i+1;
                    k=k+1;
                    j=j+1;
                }
                else{
                    i=i+1;
                    j=j+1;
                }
            }
            else if(a[i]<b[j]){
                i=i+1;
            }
            else{
                j=j+1;
            }
        }
        return intersec;
    }
}