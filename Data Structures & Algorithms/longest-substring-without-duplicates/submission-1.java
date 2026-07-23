class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l=0,r=0;
        int maxlen =0;
        HashSet<Character> set = new HashSet<>();
        while(l<=r && r<n){
            char ch = s.charAt(r);
            if(!set.contains(ch)){
                maxlen = Math.max(maxlen,r-l+1);
                set.add(ch);
                r++;
            }else{
                set.remove(s.charAt(l));
                l++;
            }


        }
        return maxlen;
        
    }
}
