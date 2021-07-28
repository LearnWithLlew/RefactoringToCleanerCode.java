package com.bettergames;

import java.util.List;

public class BigDiceGame
{

    public static final int BIG_SCORE = 50;

    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            for(ScoreCalculator calculator : List.of(new PairCalculator(), new TwoPairCalculator(), new FullHouseCalculator(), new FiveOfAKindCalculator())){
            if (calculator.isScorable(scoringType)) {
                return calculator.calculateScore(die1, die2, die3, die4, die5);
            }}
        }




        return 0;
    }

}