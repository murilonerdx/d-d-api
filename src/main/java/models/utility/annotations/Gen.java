package models.utility.annotations;

import models.ability.AbilityScore;
import models.ability.AbilityScoreType;
import models.alignment.Alignment;
import models.alignment.AlignmentType;
import models.classe.Classe;
import models.classe.ClasseType;
import models.features.Feature;
import models.languages.Language;
import models.languages.LanguageType;
import models.levels.Level;
import models.proficiency.Proficiency;
import models.skill.Skill;
import models.skill.SkillType;
import models.spell.Spell;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.subclasse.SubClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class Gen {
    public static Hero getHeroProperties(Class<?> object) throws Exception {
        GenerateHero gh = object.getAnnotation(GenerateHero.class);

        try{
            String name = Objects.equals(gh.name(), "") ? null : gh.name();
            AbilityScoreType abilityScoreType = gh.ability_score();
            ClasseType classe = gh.classe() ;
            AlignmentType alignment = gh.alignment();
            SpellCastingType spellcasting = gh.spell_casting();
            SpellCastingType features = gh.feature();
            SpellCastingType levels = gh.level();
            SkillType skill = gh.skill();
            ClasseType spell = gh.spell();
            LanguageType languages = gh.language();
            ClasseType sub_class = gh.sub_classe();
            String proficiency = Objects.equals(gh.proficiency(), "") ? null : gh.proficiency();
            int level_number = gh._level();

            return new Hero(name,
                    AbilityScore.getIndex(Objects.requireNonNull(abilityScoreType)),
                    Alignment.getIndex(Objects.requireNonNull(alignment)),
                    Classe.getIndex(Objects.requireNonNull(classe)),
                    null,
                    Feature.getIndex(Objects.requireNonNull(features)),
                    Language.getIndex(Objects.requireNonNull(languages)),
                    Level.getIndex(Objects.requireNonNull(levels), level_number),
                    Proficiency.getIndex(proficiency),
                    Skill.getIndex(Objects.requireNonNull(skill)),
                    Spell.getIndex(Objects.requireNonNull(spell)),
                    SpellCasting.getIndex(spellcasting),
                    SubClass.getIndex(Objects.requireNonNull(sub_class))
            );
        }catch(NullPointerException e){
            throw new NullPointerException("Verifique se existe alguma pendencia em seus items no modelo");
        }

    }

    public static Object get(Class<?> getNameObject, Class<?> object) {
        try{
            Object typeObject;
            GenerateHero heroAnnotation = getHeroAnnotation(object);
            TypedForge annotation = getNameObject.getDeclaredAnnotation(TypedForge.class);
            Class<?> nameObjectType = annotation.forge();
            Object[] enumConstants = nameObjectType.getEnumConstants();
            Object gnb = getNameObject.getDeclaredConstructor().newInstance();

            Object nameAtributte = getNameAtributte(getNameObject, object);
            for(Object obj : enumConstants){
                if(obj.toString().equals(Objects.requireNonNull(nameAtributte).toString())){
                    typeObject = obj;
                    if(annotation.name().equals("level")){
                        Method getIndex = getNameObject.getDeclaredMethod("getIndex", typeObject.getClass(), Integer.class);
                        return getIndex.invoke(gnb, typeObject, heroAnnotation._level());
                    }else{
                        Method getIndex = getNameObject.getMethod("getIndex", typeObject.getClass());
                        return getIndex.invoke(gnb, typeObject);
                    }

                }
            }
            return null;
        }catch(Exception e){
           return new Exception("Classe não identificada como extenção de model");
        }
    }

    public static Object getNameAtributte(Class<?> getNameObject, Class<?> object) throws InvocationTargetException, IllegalAccessException {
        GenerateHero gh = getHeroAnnotation(object);
        TypedForge annotation = getNameObject.getAnnotation(TypedForge.class);

        Method[] methods = gh.annotationType().getDeclaredMethods();

        for(Method method: methods){
            method.setAccessible(true);
            if(method.getName().equals(annotation.name())){
                return method.invoke(gh);
            }
        }
        return null;
    }

    public static GenerateHero getHeroAnnotation(Class<?> object){
        return object.getAnnotation(GenerateHero.class);
    }

}
