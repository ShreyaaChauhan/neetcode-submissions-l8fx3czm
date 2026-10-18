class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        while(i<s.length() && i<t.length()){
            if(s.charAt(i)==t.charAt(i)){
                i++;
            } else {
                break;
            }
        }

        return t.length() - i;
    }
}