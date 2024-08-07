class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] answer = new int[deck.length];
        Arrays.fill(answer, 0);
        Arrays.sort(deck);
        int skipped = 1;
        int answerIndex = 0;

        while (deck.length > 0) {
            if (skipped == 1 && answer[answerIndex] == 0) {
                answer[answerIndex] = deck[0];
                deck = Arrays.copyOfRange(deck, 1, deck.length);
                skipped = 0;
            } else if (answer[answerIndex] == 0) {
                skipped = 1;
            }

            if (answerIndex == answer.length - 1) {
                answerIndex = 0;
            } else {
                answerIndex++;
            }
        }

        return answer;
    }
}