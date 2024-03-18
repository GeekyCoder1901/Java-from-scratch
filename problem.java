You are given two jugs with capacities x liters and y liters. You have an infinite water supply. Return whether the total amount of water in both jugs may reach target using the following operations:

Fill either jug completely with water.
Completely empty either jug.
Pour water from one jug into another until the receiving jug is full, or the transferring jug is empty.

class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
           int l = gcd(x, y);
        if (x+ y< target) return false;
        return target % l == 0;
    }
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}