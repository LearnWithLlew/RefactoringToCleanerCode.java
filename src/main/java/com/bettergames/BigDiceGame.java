package com.bettergames;

public class BigDiceGame {
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5) {
        Scorer pair[] = {new Pair(), new TwoPair(), new FullHouse(), new FiveOfAKind()};
        for (Scorer pair1 : pair) {
            if (pair1.isScorable(st)) {
                return pair1.score(die1, die2, die3, die4, die5);
            }
        }

        return 0;
    }

}