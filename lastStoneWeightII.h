class Solution {
public:
    int lastStoneWeightII(vector<int>& stones)
    {
        int sum = std::accumulate(stones.begin(), stones.end(), 0);
        int half = sum / 2;
        std::vector<bool> can_reach(half + 1, false);
        can_reach[0] = true;
         
        int max_reached = 0;
        for (int stone : stones)
        {
            for (int i = half; i >= stone; i--)
            {
                if (!can_reach[i])
                    can_reach[i] = can_reach[i - stone];
                if (can_reach[i])
                        max_reached = max(max_reached, i);
            }
        }

        return sum - 2 * max_reached;
    }
};
