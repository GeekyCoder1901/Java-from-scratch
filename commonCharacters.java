Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order

class Solution(object):
    def commonChars(self, words):
        min_freq = Counter(words[0])
        for word in words:
            min_freq &= Counter(word)
        return list(min_freq.elements())
        