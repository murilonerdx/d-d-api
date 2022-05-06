import models.annotations.Gen;
import models.annotations.Hero;
import models.annotations.Murilo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class AppGen {

    public static void main(String[] args) throws NoSuchFieldException, IOException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Hero hero = Gen.getAnnotation(Murilo.class);
        System.out.println(hero.getAbilityScore());
    }
}
