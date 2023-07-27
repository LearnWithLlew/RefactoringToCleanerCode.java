package com.bettergames;

import com.github.larseckart.tcr.ArlosGitNotation2Prompt;
import com.github.larseckart.tcr.FastTestCommitRevertMainExtension;
import com.github.larseckart.tcr.TestCommitRevertExtension;
import com.github.larseckart.tcr.TestCommitRevertMainExtension;
import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.core.Options;
import org.approvaltests.reporters.intellij.IntelliJReporter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestCommitRevertExtension.class)
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
