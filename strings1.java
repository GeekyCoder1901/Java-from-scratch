You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

class Solution {
public boolean areAlmostEqual(String s1, String s2) {
char a[]=s1.toCharArray();
char b[]=s2.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
String s=new String(a);
String c=new String(b);
if(s.equals(c))
{
return true;
}
return false;
}
} 