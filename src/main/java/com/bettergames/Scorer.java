package com.bettergames;

public interface Scorer {
    boolean isScorable(ScoringType st);

    int score(int die1, int die2, int die3, int die4, int die5);
}
