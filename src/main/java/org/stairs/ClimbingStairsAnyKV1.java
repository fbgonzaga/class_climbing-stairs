package org.stairs;

public class ClimbingStairsAnyKV1 implements ClimbingStairsAnyK {
    public int calculate(int n, int k) {
        int stairCase[] = new int[n + 1];

        stairCase[0] = 1;
        stairCase[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= k && i - j >= 0; j++) {
                stairCase[i] += stairCase[i-j];
            }
        }

        return stairCase[n];
    }
}
