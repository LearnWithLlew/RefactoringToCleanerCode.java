package bettergames;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

@ExtendWith(TestCommitRevertExtension.class)
public class GameTest {

    @Test
    public void pinEverything() {
        var dice = new Integer[]{1, 2, 3, 4, 5, 6};
        var scoringTypes = ScoringType.values();

        CombinationApprovals.verifyAllCombinations(
                BigDiceGame::calculateScore,
                scoringTypes, dice, dice, dice, dice, dice
        );
    }
}
