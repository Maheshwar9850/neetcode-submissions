class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int len =0,maxi=0;
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(!set.contains(ch)){
                    maxi = Math.max(maxi,j-i+1);
                }else{
                    break;
                }
                set.add(ch);
            }
        }
        return maxi;
        
    }
}
