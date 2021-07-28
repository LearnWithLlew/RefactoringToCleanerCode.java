package com.bettergames;

public interface ScoreCalculator {
    int calculateScore(int die1, int die2, int die3, int die4, int die5);

    boolean isScorable(ScoringType scoringType);
}
