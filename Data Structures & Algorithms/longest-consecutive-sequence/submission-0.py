class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        num_set = set(nums)
        longest = 0
        for n in nums:
            if n - 1 in num_set:
                continue
            i = 1
            while (n+i) in num_set:
                i += 1
            if longest < i:
                longest = i
        return longest
        