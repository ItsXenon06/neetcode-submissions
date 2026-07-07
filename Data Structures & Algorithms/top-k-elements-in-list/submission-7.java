class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] Result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<=nums.length;i++){
            bucket.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            bucket.get(frequency).add(number);
        }
         int l=0;
        for (int i = nums.length; i>0;i--){
            if(k == 0){
                return Result;
            }
            if (!bucket.get(i).isEmpty()) {
                for (int number : bucket.get(i)) {
                Result[l] = number;
                l++;
                k--;
                }
            }
        }
        return Result;
    }

}
