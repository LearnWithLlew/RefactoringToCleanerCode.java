package com.bettergames;

import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.intellij.IntelliJReporter;
import org.approvaltests.testcommitrevert.FasterTestCommitRevertRunner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FastTestCommitRevertMainExtension.class)
public class GameTest {

    @Test
    public void pinEverything() {
        var dice = new Integer[]{1, 2, 3, 4, 5, 6};
        var scoringTypes = ScoringType.values();

        CombinationApprovals.verifyAllCombinations(
                BigDiceGame::calculateScore,
                scoringTypes, dice, dice, dice, dice, dice,
                new Options(new IntelliJReporter())
        );
    }
}
