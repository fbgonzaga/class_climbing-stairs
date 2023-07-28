package org.stairs;

public class ClimbingStairsAnyKV2 implements ClimbingStairsAnyK {
    public int calculate(int n, int k) {
        int steps[] = new int[k];

        steps[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < k && i - j >= 0; j++) {
                steps[i % k] += steps[(i - j) % k];
            }
        }
        return steps[n % k];
    }
}
