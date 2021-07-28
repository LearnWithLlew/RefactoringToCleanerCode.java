package com.bettergames;

public class BigDiceGame
{

    public static final int BIG_SCORE = 50;

    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            if (new PairCalculator().isScorable(scoringType)) {
                return new PairCalculator().calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            if (new TwoPairCalculator().isScorable(scoringType)) {
                return new TwoPairCalculator().calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            if (FullHouseCalculator.isScorable(scoringType)) {
                return FullHouseCalculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            if (FiveOfAKindCalculator.isScorable(scoringType)) {
                return FiveOfAKindCalculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

}