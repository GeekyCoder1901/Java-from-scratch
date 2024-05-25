Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hs);
    }

    private List<String> wordBreakHelper(String s, int start, HashSet<String> dict) {
        List<String> validSubstr = new ArrayList<>();

        if (start == s.length())
            validSubstr.add("");
        for (int end = start + 1; end <= s.length(); end++) {
            String prefix = s.substring(start, end);
            if (dict.contains(prefix)) {
                List<String> suffixes = wordBreakHelper(s, end, dict);
                for (String suffix : suffixes) {
                    validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }
        return validSubstr;
    }
}