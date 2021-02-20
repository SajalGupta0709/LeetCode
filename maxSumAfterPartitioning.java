int getMax(int[] arr, int i, int j) {
        int r = 0;
        for (int k = i; k <= j; k++) {
            r = Math.max(r, arr[k]);
        }
        return r;
    }
    
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = Math.max(i - k + 1, 0); j <= i; j++) {
                dp[i] = Math.max(dp[i], (j - 1 < 0 ? 0 : dp[j - 1]) + getMax(arr, j, i) * (i - j + 1));
            }
        }
        return dp[arr.length - 1];
    }
