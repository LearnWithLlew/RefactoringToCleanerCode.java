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
            if (new FullHouseCalculator().isScorable(scoringType)) {
                return new FullHouseCalculator().calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            if (new FiveOfAKindCalculator().isScorable(scoringType)) {
                return new FiveOfAKindCalculator().calculateScore(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

}