Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result=new ArrayList<>();

        for(String ele1:words){
            for(String ele2:words){
                if(!ele1.equals(ele2)&&ele2.contains(ele1)){
                    result.add(ele1);
                    break;
                }
            }
        }
        return result;
    }
}