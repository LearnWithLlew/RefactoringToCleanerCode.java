package com.bettergames;

public class BigDiceGame
{

    public static final int BIG_SCORE = 50;

    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            ScoreCalculator calculator = new PairCalculator();
            if (calculator.isScorable(scoringType)) {
                return calculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            TwoPairCalculator calculator = new TwoPairCalculator();
            if (calculator.isScorable(scoringType)) {
                return calculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            FullHouseCalculator calculator = new FullHouseCalculator();
            if (calculator.isScorable(scoringType)) {
                return calculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }
        {
            FiveOfAKindCalculator calculator = new FiveOfAKindCalculator();
            if (calculator.isScorable(scoringType)) {
                return calculator.calculateScore(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

}