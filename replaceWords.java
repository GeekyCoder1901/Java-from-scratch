In English, we have a concept called root, which can be followed by some other word to form another longer word - let's call this word derivative. For example, when the root "help" is followed by the word "ful", we can form a derivative "helpful".

Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces, replace all the derivatives in the sentence with the root forming it. If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.

Return the sentence after the replacement.

class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        Set<String> s = new HashSet<>(dict);
        StringBuilder res = new StringBuilder();
        List<String> temp = new ArrayList<>(
            Arrays.asList(sentence.split(" "))
        );    
        for (String t : temp) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i++);
                if (s.contains(curr)) {
                    res.append(curr).append(" ");
                    break;
                }
                if (i == t.length() + 1) res.append(t).append(" ");
            }
        } 
        res.deleteCharAt(res.length() - 1); 
        return res.toString();
    }
}