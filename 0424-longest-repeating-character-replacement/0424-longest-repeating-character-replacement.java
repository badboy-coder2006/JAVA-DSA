class Solution {
    public int characterReplacement(String s, int k) {

        int l  = 0;
        int mf = 0;
        int ml = 0;
        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            char ch =  s.charAt(i);
            freq[ch-'A']++;
            mf = Math.max(mf,freq[ch-'A']);
            int wl  =  i-l+1;
            if(wl-mf>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            ml = Math.max(ml,i-l+1);

        }
        return ml;
        
    }
}