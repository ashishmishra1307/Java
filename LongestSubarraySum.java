public class LongestSubarraySum {
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;

            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];

                if (currentSum == K) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};        // 0,1,2,3,4       == 4-0+1 = 5
        int K = 3;

        int length = longestSubarrayWithSumK(arr, K);
        System.out.println("Length of the longest subarray with sum " + K + " is: " + length);
    }
}
