package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        if (scoringType == ScoringType.Pair) {
            return PairScore.calculateScore(die1, die2, die3, die4, die5);
        } else if (scoringType == ScoringType.TwoPair) {
            return TwoPairScore.applesauce2(die1, die2, die3, die4, die5);
        } else if (scoringType == ScoringType.FullHouse) {
            return FullHouseScore.applesauce3(die1, die2, die3, die4, die5);
        } else if (scoringType == ScoringType.FiveOfAKind) {
            return FiveOfAKindScore.applesauce4(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}