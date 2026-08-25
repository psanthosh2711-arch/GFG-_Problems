class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        ArrayList<Integer> array=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int v=1;v<=arr.length;v++){
            if(map.containsKey(v)){
                array.add(map.get(v));
            }
            else{
                array.add(0);
            }
        }
        return array;
    }
}
