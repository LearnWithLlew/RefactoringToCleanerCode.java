package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        if (PairScore.isApplesauce(scoringType)) {
            return PairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (TwoPairScore.isApplesauce2(scoringType)) {
            return TwoPairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (FullHouseScore.isFullHouse(scoringType)) {
            return FullHouseScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (FiveOfAKindScore.isApplesauce3(scoringType)) {
            return FiveOfAKindScore.calculateScore(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}