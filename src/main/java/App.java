import models.ability.AbilityScore;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        AbilityScore cha = AbilityScore.getIndex("cha");

        System.out.println(cha);
    }
}
