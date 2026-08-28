class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                arr.add(a[i]);
                map.put(a[i],1);
            }
        }
        for(int j=0;j<b.length;j++){
            if(!map.containsKey(b[j])){
                arr.add(b[j]);
                map.put(b[j],1);
            }
        }
        arr.sort(null);
        return arr;
    }
}
