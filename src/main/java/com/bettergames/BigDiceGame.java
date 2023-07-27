package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        if (isApplesauce(scoringType)) {
            return PairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (isApplesauce2(scoringType)) {
            return TwoPairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (isFullHouse(scoringType)) {
            return FullHouseScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (isApplesauce3(scoringType)) {
            return FiveOfAKindScore.calculateScore(die1, die2, die3, die4, die5);
        }

        return 0;
    }

    private static boolean isApplesauce3(ScoringType scoringType) {
        return scoringType == ScoringType.FiveOfAKind;
    }

    private static boolean isFullHouse(ScoringType scoringType) {
        return scoringType == ScoringType.FullHouse;
    }

    private static boolean isApplesauce2(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    private static boolean isApplesauce(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

}