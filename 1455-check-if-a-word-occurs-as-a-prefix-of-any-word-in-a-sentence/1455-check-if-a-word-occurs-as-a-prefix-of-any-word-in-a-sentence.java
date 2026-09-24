
class Solution { 
    public int isPrefixOfWord(String sentence, String searchWord) { 
        
        int c = 1; 
        
        String[] words = sentence.split(" "); 
        
        for (int i = 0; i < words.length; i++) { 
            
            if (words[i].startsWith(searchWord)) { 
                return c; 
            } else { 
                c++; 
            } 
        } 
        
        return -1; 
    } 
}

