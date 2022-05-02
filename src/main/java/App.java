import models.ability.AbilityScore;
import models.ability.AbilityScoreIndex;
import models.alignment.Alignment;
import models.alignment.AlignmentIndex;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
//        AbilityScore as = AbilityScore.getIndex(AbilityScoreIndex.charisma);
        Alignment ali = Alignment.getIndex(AlignmentIndex.CG);

        System.out.println(ali);
    }
}
