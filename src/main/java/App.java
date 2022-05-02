import models.ability.AbilityScore;
import models.languages.Language;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        // AbilityScore as = AbilityScore.getIndex(AbilityScoreType.charisma);
        // Alignment ali = Alignment.getIndex(AlignmentType.CG);
        List<Object> ali = AbilityScore.get();

        System.out.println(ali);
    }
}
