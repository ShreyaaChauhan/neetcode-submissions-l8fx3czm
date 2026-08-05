class Solution {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length-1);
        int lastLeft = 0;

        for(int i = 0;i<=s.length;i++){
            if(i == s.length || s[i] == ' '){
                reverse(s, lastLeft, i-1);
                lastLeft = i+1;
            }
        }
    }

    void reverse(char[] c, int left, int right){
        while(left<=right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;

        }
    }
}