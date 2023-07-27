package com.bettergames;

import java.util.Arrays;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        {
            DiceScorer[] scorer = getScoringTypes();
            return Arrays.stream(scorer)
                    .filter(diceScorer -> diceScorer.isScore(scoringType))
                    .findFirst().map(diceScorer -> diceScorer.calculateScore(die1, die2, die3, die4, die5))
                    .orElse(0);
        }

    }

    private static DiceScorer[] getScoringTypes() {
        var scorer = new DiceScorer[]{new PairScore(), new TwoPairScore(), new FullHouseScore(), new FiveOfAKindScore()};
        return scorer;
    }

}