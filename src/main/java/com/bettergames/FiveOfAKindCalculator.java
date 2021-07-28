package com.bettergames;

public class FiveOfAKindCalculator {
    public static int calculateScore(int die1, int die2, int die3, int die4, int die5) {
        int[] dice1 = {die1, die2, die3, die4, die5};
        var counts2 = new int[6];
        for (var die : dice1)
        {
            counts2[die - 1]++;
        }

        for (var i1 = 0; i1 != 6; i1++)
        {
            if (counts2[i1] == 5)
            {
                return BigDiceGame.BIG_SCORE;
            }
        }

        return 0;
    }

    public boolean isScorable(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }
}
