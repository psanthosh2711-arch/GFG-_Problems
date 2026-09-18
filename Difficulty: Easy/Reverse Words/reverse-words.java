class Solution {
    public String reverseWords(String s) {
        // Code here
        int last=s.length()-1;
        int first=last;
        StringBuilder res=new StringBuilder();
        while(first>=0){
            while(first>=0){
                if(s.charAt(first)=='.'){
                    first=first-1;
                }
                else{
                    break;
                }
            }
            last=first;
            while(first>=0){
                if(s.charAt(first)!='.'){
                    first=first-1;
                }
                else{
                    break;
                }
            }
            if(last>=0){
                String sub=s.substring(first+1,last+1);
                if(res.length()>0){
                    res.append(".");
                    
                }
                res.append(sub);
            }
        }
        return res.toString();
    }
}
