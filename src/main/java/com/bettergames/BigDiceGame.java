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
                return new FullHouse().score(die1, die2, die3, die4, die5);
            }

            case FiveOfAKind:
            {
                return new FiveOfAKind().fiveOfAKindScore(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

}