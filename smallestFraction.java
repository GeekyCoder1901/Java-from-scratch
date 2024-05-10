You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.

For every i and j where 0 <= i < j < arr.length, we consider the fraction arr[i] / arr[j].

Return the kth smallest fraction considered. Return your answer as an array of integers of size 2, where answer[0] == arr[i] and answer[1] == arr[j].

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // Priority queue to store fractions with comparator to sort by fraction value
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(arr[a[0]] * arr[b[1]], arr[a[1]] * arr[b[0]]));

        // Initialize the heap with the first possible fraction from each numerator
        for (int i = 0; i < arr.length - 1; i++) {
            pq.add(new int[] { i, arr.length - 1 });
        }

        // Extract the smallest fraction k-1 times to reach the k-th smallest
        for (int i = 1; i < k; i++) {
            int[] frac = pq.poll();
            int numeratorIndex = frac[0];
            int denominatorIndex = frac[1];

            // Push the next fraction with the same numerator and the next smaller
            // denominator
            if (denominatorIndex - 1 > numeratorIndex) {
                pq.add(new int[] { numeratorIndex, denominatorIndex - 1 });
            }
        }

        // The k-th smallest fraction's indices after popping k-1 elements
        int[] result = pq.poll();
        return new int[] { arr[result[0]], arr[result[1]] };
    }
}