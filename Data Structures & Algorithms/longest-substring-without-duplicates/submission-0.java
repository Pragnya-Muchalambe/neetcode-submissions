class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen =0;
        Set<Character> set = new HashSet<>();

        for(int r = 0; r< s.length() ; r++){
            char c = s.charAt(r);

            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            maxLen = Math.max(maxLen, r-left+1);
        }
        return maxLen;
    }
}
