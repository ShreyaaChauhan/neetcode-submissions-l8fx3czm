class Solution {
    public boolean makeEqual(String[] words) {
        int[] freq = new int[26];
        StringBuilder s = new StringBuilder();

        for(String word: words){
            s.append(word);
        }

        for(char c: s.toString().toCharArray()){
            freq[c-'a']++;
        }

        for(int i = 0;i<26;i++){
            if(freq[i]%words.length!=0){
                return false;
            }
        }

        return true;   
    }
}