class Solution {
    public int minFlipsMonoIncr(String s) {
        if(s==null || s.length()<=0)
            return 0;
        
        char[] sChar=s.toCharArray();
        int fc=0;
        int oc=0;

        for(int i=0;i<sChar.length;i++)
        {
            if(sChar[i]=='0'){
                if(oc==0) continue;
                else fc++;
            }
            else
                oc++;
            if(fc>oc)
                fc=oc;
        }
            return fc;
    }

}
