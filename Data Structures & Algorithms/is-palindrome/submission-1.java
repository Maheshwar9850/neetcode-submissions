class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l=0,r=n-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }else{
                char left = Character.toLowerCase(s.charAt(l));
                char right = Character.toLowerCase(s.charAt(r));
                if(left!=right){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
        
    }
}