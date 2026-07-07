class Solution {
    public int[] twoSum(int[] nums, int target) {
        int Result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
         for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                Result[0] = map.get(complement);
                Result[1] = i;
                return Result;
            }
            else map.put(nums[i], i);
        }
        return Result;
    }
}