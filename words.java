A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
      HashMap<String, Integer> hm = new HashMap<>();
        String[] arr1 = s1.split(" ");
        for(int i=0; i<arr1.length; i++){
            if(hm.containsKey(arr1[i])) hm.put(arr1[i], hm.get(arr1[i])+1);
            else hm.put(arr1[i], 1);
        }
        String[] arr2 = s2.split(" ");
        for(int i=0; i<arr2.length; i++){
            if(hm.containsKey(arr2[i])) hm.put(arr2[i], hm.get(arr2[i])+1);
            else hm.put(arr2[i], 1);
        }
        List<String> ll = new ArrayList<>();
        for(String e:hm.keySet()){
            if(hm.get(e)==1) ll.add(e);
        }
        String[] ans = new String[ll.size()];
        for(int i=0; i<ll.size(); i++){
            ans[i] = ll.get(i);
        }
        return ans;  
    }
}