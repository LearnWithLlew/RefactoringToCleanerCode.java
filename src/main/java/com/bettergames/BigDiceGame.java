package com.bettergames;

public class BigDiceGame
{
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5)
    {
        Pair pair = new Pair();
        if (pair.isScorable(st)) {
            return pair.score(die1, die2, die3, die4, die5);
        } else if (new TwoPair().isScorable(st)) {
            return new TwoPair().score(die1, die2, die3, die4, die5);
        } else if (new FullHouse().isScorable(st)) {
            return new FullHouse().score(die1, die2, die3, die4, die5);
        } else if (new FiveOfAKind().isScorable(st)) {
            return new FiveOfAKind().score(die1, die2, die3, die4, die5);
        }

        return 0;
    }

}