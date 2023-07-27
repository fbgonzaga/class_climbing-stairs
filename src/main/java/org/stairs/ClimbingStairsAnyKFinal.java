package org.stairs;

public class ClimbingStairsAnyKFinal implements ClimbingStairsAnyK{
    public int calculate(int n, int k) {
        int pathHistory[] = new int[k];

        pathHistory[0] = 1;
        pathHistory[1] = 1;

        for (int i = 2; i <= n; i++) {
            pathHistory[i % k] = (2 * pathHistory[(i - 1) % k]
                - (i > k ? pathHistory[(i - k) % k] : 0));
        }

        return pathHistory[n % k];
    }
}
