package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            var scorer = new PairScore();
            if (scorer.isScore(scoringType)) {
                return scorer.calculateScore(die1, die2, die3, die4, die5);
            }
        }
        if (new TwoPairScore().isScore(scoringType)) {
            return new TwoPairScore().calculateScore(die1, die2, die3, die4, die5);
        }
        if (new FullHouseScore().isScore(scoringType)) {
            return new FullHouseScore().calculateScore(die1, die2, die3, die4, die5);
        }
        if (new FiveOfAKindScore().isScore(scoringType)) {
            return new FiveOfAKindScore().calculateScore(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}