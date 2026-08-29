class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> union= new ArrayList<>();
        int i=0;
        int j=0;
        int k=0;
        while(i!=a.length && j!=b.length){
            if(a[i]<=b[j]){
                if(union.size()==0){
                    union.add(a[i]);
                    i=i+1;
                    k=k+1;
                }
                else if(union.get(k-1)!=a[i]){
                    union.add(a[i]);
                    i=i+1;
                    k=k+1;
                }
                else{
                    i=i+1;
                }
            }
            else{
                if(union.size()==0){
                    union.add(b[j]);
                    j=j+1;
                    k=k+1;
                }
                else if(union.get(k-1)!=b[j]){
                    union.add(b[j]);
                    j=j+1;
                    k=k+1;
                }
                else{
                    j=j+1;
                }
            }
        }
        
        while(j!=b.length){
            if(union.size()==0){
                union.add(b[j]);
                j=j+1;
                k=k+1;
            }
            else if(union.get(k-1)!=b[j]){
                union.add(b[j]);
                j=j+1;
                k=k+1;
            }
            else{
                j=j+1;
            }
        }
        while(i!=a.length){
            if(union.size()==0){
                union.add(a[i]);
                i=i+1;
                k=k+1;
            }
            else if(union.get(k-1)!=a[i]){
                union.add(a[i]);
                i=i+1;
                k=k+1;
            }
            else{
                i=i+1;
            }
        }
        return union;
    }
}
