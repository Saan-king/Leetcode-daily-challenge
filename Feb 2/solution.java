class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> alpha = new HashMap<>();
        for(int i=0;i<order.length();i++)
            alpha.put(order.charAt(i),i);
        for(int i=1;i<words.length;i++){
            String a=words[i-1],b=words[i];
            for(int j=0;j<a.length();j++){
                if(j==b.length()) return false;
                char ac=a.charAt(j),bc=b.charAt(j);
                if(alpha.get(ac)<alpha.get(bc)) break;
                if(alpha.get(ac)>alpha.get(bc)) return false;
            }
        }
        return true;
    }
}
