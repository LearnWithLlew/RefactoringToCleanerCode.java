package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5)
    {
        if (Pair.isPair(st)) {
            return new Pair().score(die1, die2, die3, die4, die5);
        } else if (TwoPair.isTwoPair(st)) {
            return new TwoPair().score(die1, die2, die3, die4, die5);
        } else if (FullHouse.isFullHouse(st)) {
            return new FullHouse().score(die1, die2, die3, die4, die5);
        } else if (FiveOfAKind.isFiveOfAKind(st)) {
            return new FiveOfAKind().score(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}