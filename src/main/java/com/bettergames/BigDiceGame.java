package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        if (PairScore.isScore(scoringType)) {
            return PairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (TwoPairScore.isScore(scoringType)) {
            return TwoPairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (FullHouseScore.isScore(scoringType)) {
            return FullHouseScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (FiveOfAKindScore.isScore(scoringType)) {
            return FiveOfAKindScore.calculateScore(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}