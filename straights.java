Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.

Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }
        Map<Integer, Integer> cardCount = new TreeMap<>();
        for (int card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }
        for (int card : cardCount.keySet()) {
            int count = cardCount.get(card);
            if (count > 0) {
                for (int i = 0; i < groupSize; ++i) {
                    if (cardCount.getOrDefault(card + i, 0) < count) {
                        return false;
                    }
                    cardCount.put(card + i, cardCount.get(card + i) - count);
                }
            }
        }
        return true;
    }
}