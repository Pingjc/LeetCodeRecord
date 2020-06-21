package findBestValue;

import java.util.Arrays;

public class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int sum = 0;
        int aver = target / arr.length;
        if (arr[arr.length - 1] <= aver) {
            return arr[arr.length - 1];
        }

        if (arr[0] >= aver) {
            return diffmin(target, aver, 0, arr.length);
        }

        while (true) {
            if (i >= arr.length) {
                break;
            }

            if (arr[i] >= aver) {
                i--;
                break;
            }

            sum += arr[i];
            i++;
        }

        while (i < arr.length - 1) {
            int newAver = (target - sum) / (arr.length - 1 - i);
            if ((arr[i] <= newAver) && (arr[i + 1] > newAver)) {
                return diffmin(target, newAver, sum, arr.length - 1 - i);
            }

            i++;
            sum += arr[i];
        }

        return arr[arr.length - 1];
    }

    private int diffmin(int target, int aver, int sum, int length) {
        int diff1 = aver * length + sum;
        int diff2 = diff1 + length;
        if (Math.abs(diff1 - target) <= Math.abs(diff2 - target)) {
            return aver;
        } else {
            return aver + 1;
        }
    }
}
