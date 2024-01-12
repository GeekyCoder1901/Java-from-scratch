A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.

A sentence is circular if:

The last character of a word is equal to the first character of the next word.
The last character of the last word is equal to the first character of the first word.

Given a string sentence, return true if it is circular. Otherwise, return false.


class Solution {
public boolean isCircularSentence(String sentence) {
char[] ch = sentence.toCharArray();
for(int i=1;i<ch.length-1;i++){
if(ch[i]==' '){
if(ch[i-1]!=ch[i+1])
return false;
}
}
if(ch[0]!=ch[ch.length-1])
return false;
return true;
}
}