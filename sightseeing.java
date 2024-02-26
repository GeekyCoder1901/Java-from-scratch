You are given an integer array values where values[i] represents the value of the ith sightseeing spot. Two sightseeing spots i and j have a distance j - i between them.

The score of a pair (i < j) of sightseeing spots is values[i] + values[j] + i - j: the sum of the values of the sightseeing spots, minus the distance between them.

Return the maximum score of a pair of sightseeing spots

class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        var maxScore = 0;
	var n = values.length;
	var dp = new int[n];
	dp[0] = values[0];

	for (var i = 1; i < n; i++) {
		maxScore = Math.max(maxScore, dp[i - 1] + values[i] - i);
		dp[i] = Math.max(dp[i - 1], values[i] + i);
	}
	return maxScore;
    }
}