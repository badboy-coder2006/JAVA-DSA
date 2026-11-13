class Solution {
    public int strStr(String haystack, String needle) {

        int c = -1;
        if(haystack.contains(needle)){
            c = haystack.indexOf(needle);
        }
        

        return c;

        
    }
}