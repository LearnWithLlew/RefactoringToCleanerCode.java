package com.bettergames;

public interface DiceScorer {
    boolean isScore(ScoringType scoringType);

    int calculateScore(int die1, int die2, int die3, int die4, int die5);
}
