package com.bettergames;

import java.util.Arrays;

public class BigDiceGame {
    public static int calculateScore(ScoringType st, int die1, int die2, int die3, int die4, int die5) {
        Scorer pair[] = {new Pair(), new TwoPair(), new FullHouse(), new FiveOfAKind()};
        return Arrays.
                stream(pair)
                .filter(pair1 -> pair1.isScorable(st))
                .findFirst()
                .map(pair1 -> pair1.score(die1, die2, die3, die4, die5))
                .orElse(0);

    }

}