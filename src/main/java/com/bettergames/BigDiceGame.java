package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType scoringType, int die1, int die2, int die3, int die4, int die5)
    {
        switch (scoringType)
        {
            case Pair:
                return PairScore.applesauce(die1, die2, die3, die4, die5);

            case TwoPair:
                return TwoPairScore.applesauce2(die1, die2, die3, die4, die5);

            case FullHouse:
                return FullHouseScore.applesauce3(die1, die2, die3, die4, die5);

            case FiveOfAKind:
                return applesauce4(die1, die2, die3, die4, die5);
        }

        return 0;
    }

    private static int applesauce4(int die1, int die2, int die3, int die4, int die5) {
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
                int bigScore = 50;
                return bigScore;
            }
        }

        return 0;
    }

}