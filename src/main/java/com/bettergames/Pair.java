package com.bettergames;

public class Pair implements Scorer {
    public static boolean isScorable(ScoringType st) {
        return st == ScoringType.Pair;
    }

    public int score(int die1, int die2, int die3, int die4, int die5) {
        final int value = 2;
        int[] tallies1;
        tallies1 = new int[6];
        tallies1[die1 - 1]++;
        tallies1[die2 - 1]++;
        tallies1[die3 - 1]++;
        tallies1[die4 - 1]++;
        tallies1[die5 - 1]++;
        for (var i = 6 - 1; i >= 0; i--)
        {
            if (tallies1[i] >= value)
            {
                return (i + 1) * value;
            }
        }

        return 0;
    }
}
