package org.stairs;

public class ClimbingStairsAnyKV3 implements ClimbingStairsAnyK{
    public int calculate(int n, int k) {
        int steps[] = new int[k];

        steps[0] = 1;
        steps[1] = 1;
        for (int i = 2; i <= n; i++) {
            steps[i % k] = (2 * steps[(i - 1) % k]
                - (i > k ? steps[(i - k) % k] : 0));
        }
        return steps[n % k];
    }
}
