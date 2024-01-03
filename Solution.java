public class Solution {
    public static void main(String[] args) 
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] result = getConcatenation(array1, array2);

        // Print the concatenated array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] getConcatenation(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] result = new int[length];

        // Copy elements from the first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }
}
