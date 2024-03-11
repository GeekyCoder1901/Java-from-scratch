Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

class Solution {
    public int nextGreaterElement(int n) {
      String originalNumber = Integer.toString(n);
        for (int i = originalNumber.length() - 2; i >= 0; --i) {
            char currHigh = '9' + 1;
            int swapIndex = -1;
            var currCh = originalNumber.charAt(i);
            for (int j = i + 1; j < originalNumber.length(); ++j) {
                var swapCh = originalNumber.charAt(j);
                if (swapCh > currCh && swapCh < currHigh) {
                    currHigh = swapCh;
                    swapIndex = j;
                }
            }
            if (swapIndex > -1) {
                long val = Long.parseLong(swapAndSort(originalNumber, i, swapIndex));
                if (val > Integer.MAX_VALUE) return -1;
                return (int)val;
            }
        }
        return -1;
    }
    
    private String swapAndSort(String s, int i, int j) {
        char[] arr = s.toCharArray();
        arr[i] = s.charAt(j);
        arr[j] = s.charAt(i);
        Arrays.sort(arr, i + 1, s.length());
        return String.valueOf(arr);  
    }
}