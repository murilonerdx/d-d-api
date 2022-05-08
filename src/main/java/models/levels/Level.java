package models.levels;

import models.utility.annotations.TypedForge;
import models.classe.ClasseType;
import models.spellcasting.SpellCasting;
import models.spellcasting.SpellCastingType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.path.ClassLevelType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.APIProperties.getServer;

/**
 * The type Level.
 */
@TypedForge(name="level", forge= SpellCastingType.class)
public class Level {
    private String level;
    private BigDecimal ability_score_bonuses;
    private BigDecimal prof_bonus;
    private DefaultDataAPI[] features;
    private SpellCasting.SpellCastingLevels spellcasting;
    private Object class_specific;

    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<Level> get() throws IOException {
        List<Level> levelsMaster = new ArrayList<>();

        for (SpellCastingType type : SpellCastingType.values()) {
            String path = getServer() + ClassLevelType.LEVELS.endpointReplace(type.name())
                    .replace("{class_level}", "");
            levelsMaster.addAll(convertToArray((Level[]) RequestAPI.GET(path, Level[].class)));
        }

        return levelsMaster;
    }

    /**
     * Gets index.
     *
     * @param type  the type
     * @param level the level
     * @return the index
     * @throws IOException the io exception
     */
    public static Level getIndex(SpellCastingType type, Integer level) throws IOException {
        String lvl = level != null ? String.valueOf(level) : "1";
        String path = getServer() + ClassLevelType.LEVELS.endpointReplace(type.name())
                .replace("{class_level}", lvl);
        return (Level) RequestAPI.GET(path, Level.class);
    }

    /**
     * Gets subclass.
     *
     * @param subclass     the subclass
     * @param spellcasting the spellcasting
     * @return the subclass
     * @throws IOException the io exception
     */
    public static List<Level> getSubclass(ClasseType subclass, SpellCastingType spellcasting) throws IOException {
        String path = getServer() + ClassLevelType.LEVELS.endpointReplace(spellcasting.name())
                .replace("{class_level}", "?subclass=" + subclass.name());
        return convertToArray((Level[]) RequestAPI.GET(path, Level[].class));
    }

    /**
     * Convert to list list.
     *
     * @param levels the levels
     * @return the list
     */
    public static List<Level> convertToArray(Level[] levels) {
        return new ArrayList<>(Arrays.asList(levels));
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * Gets ability score bonuses.
     *
     * @return the ability score bonuses
     */
    public BigDecimal getAbility_score_bonuses() {
        return ability_score_bonuses;
    }

    /**
     * Sets ability score bonuses.
     *
     * @param ability_score_bonuses the ability score bonuses
     */
    public void setAbility_score_bonuses(BigDecimal ability_score_bonuses) {
        this.ability_score_bonuses = ability_score_bonuses;
    }

    /**
     * Gets prof bonus.
     *
     * @return the prof bonus
     */
    public BigDecimal getProf_bonus() {
        return prof_bonus;
    }

    /**
     * Sets prof bonus.
     *
     * @param prof_bonus the prof bonus
     */
    public void setProf_bonus(BigDecimal prof_bonus) {
        this.prof_bonus = prof_bonus;
    }

    /**
     * Get features default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getFeatures() {
        return features;
    }

    /**
     * Sets features.
     *
     * @param features the features
     */
    public void setFeatures(DefaultDataAPI[] features) {
        this.features = features;
    }

    /**
     * Gets spellcasting.
     *
     * @return the spellcasting
     */
    public SpellCasting.SpellCastingLevels getSpellcasting() {
        return spellcasting;
    }

    /**
     * Sets spellcasting.
     *
     * @param spellcasting the spellcasting
     */
    public void setSpellcasting(SpellCasting.SpellCastingLevels spellcasting) {
        this.spellcasting = spellcasting;
    }

    /**
     * Gets class specific.
     *
     * @return the class specific
     */
    public Object getClass_specific() {
        return class_specific;
    }

    /**
     * Sets class specific.
     *
     * @param class_specific the class specific
     */
    public void setClass_specific(Object class_specific) {
        this.class_specific = class_specific;
    }

    @Override
    public String toString() {
        return "Level{" +
                "level='" + level + '\'' +
                ", ability_score_bonuses=" + ability_score_bonuses +
                ", prof_bonus=" + prof_bonus +
                ", features=" + Arrays.toString(features) +
                ", spellcasting=" + spellcasting +
                ", class_specific=" + class_specific +
                '}';
    }
}
