package com.bettergames;

public class BigDiceGame
{

    public static final int BIG_SCORE = 50;

    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        if (isaBoolean(scoringType)) {
            return PairCalculator.doSomething(die1, die2, die3, die4, die5);
        }
        if (isaBoolean1(scoringType)) {
            return TwoPairCalculator.doAnotherThing(die1, die2, die3, die4, die5);
        }
        if (scoringType == ScoringType.FullHouse) {
            return FullHouseCalculator.doSomethingOnCodingFestival(die1, die2, die3, die4, die5);
        }
        if (scoringType == ScoringType.FiveOfAKind) {
            return FiveOfAKindCalculator.doSomeNextThing5(die1, die2, die3, die4, die5);
        }

        return 0;
    }

    private static boolean isaBoolean1(ScoringType scoringType) {
        return scoringType == ScoringType.TwoPair;
    }

    private static boolean isaBoolean(ScoringType scoringType) {
        return scoringType == ScoringType.Pair;
    }

}