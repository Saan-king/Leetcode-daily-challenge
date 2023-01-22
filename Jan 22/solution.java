class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> r=new ArrayList<List<String>>();
        helper(r,new ArrayList<String>(),s);
        return r;
    }

    public void helper(List<List<String>> res,List<String> curr,String s){
        if(s.length()==0)
        {
            res.add(new ArrayList<String>(curr));
            return;
        }

        for(int i=0;i<s.length();i++){
            if(Palindrome(s,0,i)){
                curr.add(s.substring(0,i+1));
                helper(res,curr,s.substring(i+1));
                curr.remove(curr.size()-1);
            }
        }
    }

    private boolean Palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

}