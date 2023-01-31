package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5)
    {
        switch (st)
        {
            case Pair:
            {
                return new Pair().score(die1, die2, die3, die4, die5);
            }

            case TwoPair:
            {
                return new TwoPair().score(die1, die2, die3, die4, die5);
            }

            case FullHouse:
            {
                return new FullHouse().fullHouseScore(die1, die2, die3, die4, die5);
            }

            case FiveOfAKind:
            {
                return fiveOfAKindScore(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

    private static int fiveOfAKindScore(int die1, int die2, int die3, int die4, int die5) {
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
                return 50;
            }
        }

        return 0;
    }

}