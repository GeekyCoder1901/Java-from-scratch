Break a palindrome

class Solution {
    public String breakPalindrome(String palindrome) {
         if(palindrome.length()==1)
            return "";
        char[] a=palindrome.toCharArray();boolean flag=true;
        for(int i=0;i<a.length/2;i++)
            if(a[i]!='a'){
                a[i]='a';
                flag=false;
                break;
            }
        if(flag==true)
            a[a.length-1]='b';
        return new String(a);
    }
}