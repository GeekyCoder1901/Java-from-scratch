Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.

A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.

Note that points on the edge of a vertical area are not considered included in the area.

 

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xSorted = Arrays.stream(points).mapToInt(point -> point[0]).sorted().toArray();

        int maxWidth = 0;
        for (int i = 0; i < xSorted.length - 1; i++) {
            maxWidth = Math.max(maxWidth, xSorted[i + 1] - xSorted[i]);
        }

        return maxWidth;        
    }
}