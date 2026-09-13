class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for(int num : nums){
            set.add(num);
        }

        if(set.size() == nums.length){
            return false;
        }
        else{
            return true;
        }
    }
}