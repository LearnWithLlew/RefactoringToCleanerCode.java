package com.bettergames;

public class BigDiceGame
{

    public static final int BIG_SCORE = 50;

    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        switch (scoringType)
        {
            case Pair:
                return PairCalculator.doSomething(die1, die2, die3, die4, die5);

            case TwoPair:
                return TwoPairCalculator.doAnotherThing(die1, die2, die3, die4, die5);

            case FullHouse:
                return FullHouseCalculator.doSomethingOnCodingFestival(die1, die2, die3, die4, die5);

            case FiveOfAKind:
                return doSomeNextThing5(die1, die2, die3, die4, die5);
        }

        return 0;
    }

    private static int doSomeNextThing5(int die1, int die2, int die3, int die4, int die5) {
        int[] dice1 = {die1, die2, die3, die4, die5};
        var counts2 = new int[6];
        for (var die : dice1)
        {
            counts2[die - 1]++;
        }

        for (var i1 = 0; i1 != 6; i1++)
        {
            if (counts2[i1] == 5)
            {
                return BIG_SCORE;
            }
        }

        return 0;
    }

}