package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5)
    {
        if (isPair(st)) {
            return new Pair().score(die1, die2, die3, die4, die5);
        } else if (st == ScoringType.TwoPair) {
            return new TwoPair().score(die1, die2, die3, die4, die5);
        } else if (st == ScoringType.FullHouse) {
            return new FullHouse().score(die1, die2, die3, die4, die5);
        } else if (st == ScoringType.FiveOfAKind) {
            return new FiveOfAKind().score(die1, die2, die3, die4, die5);
        }

        return 0;
    }

    private static boolean isPair(ScoringType st) {
        return st == ScoringType.Pair;
    }

}