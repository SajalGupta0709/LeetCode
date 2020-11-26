class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        n = len(candidates)
        res = []
        def findSum(currSum, currArr, idx):
            if currSum > target: return
            if currSum == target:
                currArr.sort()
                if currArr not in res:
                    res.append(currArr)
            
            for i in range(idx, n):
                if i > idx and candidates[i] == candidates[i-1]: 
                    continue
                findSum(currSum + candidates[i], currArr + [candidates[i]], i+1)
        
        findSum(0,[],0)
        return res
