package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            var scorer = new DiceScorer[]{new PairScore(), new TwoPairScore(), new FullHouseScore(), new FiveOfAKindScore()};
            for (DiceScorer diceScorer : scorer) {
                if (diceScorer.isScore(scoringType)) {
                    return diceScorer.calculateScore(die1, die2, die3, die4, die5);
                }

            }
        }

        return 0;
    }

}