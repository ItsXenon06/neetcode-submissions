class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        length = len(nums)
        found = set()

        for i in range(length - 2):
            left = i + 1
            right = length - 1
            while left < right:
                total = nums[i] + nums [left] + nums[right]

                if total == 0:
                    found.add((nums[i], nums[left], nums[right]))
                    left += 1
                    right -= 1
                elif total < 0:
                    left += 1
                else:
                    right -= 1
        return [list(t) for t in found]