package models.spellcasting;


import models.utility.annotations.TypedForge;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.APIProperties.getServer;

/**
 * The type Spell casting.
 */
@TypedForge(name="spell_casting", forge= SpellCastingType.class)
public class SpellCasting {
    private BigDecimal level;
    private List<Info> info;
    private DefaultDataAPI spellcasting_ability;

    /**
     * Get list.
     *
     * @return the list
     * @throws IOException the io exception
     */
    public static List<SpellCasting> get() throws IOException {
        List<SpellCasting> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for (SpellCastingType type : values) {
            SpellCasting index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static SpellCasting getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.SPELLCASTING.endpointReplace(type.name());
        return (SpellCasting) RequestAPI.GET(path, SpellCasting.class);
    }

    /**
     * Search spell casting list.
     *
     * @param type the type
     * @return the list
     * @throws Exception the exception
     */
    public static List<SpellCasting> searchSpellCasting(SpellCastingType type) throws Exception {
        Pattern pattern = Pattern.compile(type.name().toLowerCase());
        List<SpellCasting> spellCastings = get();
        List<SpellCasting> infos = new ArrayList<>();
        for (int a = 0; a <= spellCastings.size() - 1; a++) {
            for (SpellCasting result : get()) {
                for (Info info : result.getInfo()) {
                    Matcher match = pattern.matcher(info.getName().toLowerCase());
                    while (match.find()) {
                        SpellCasting index = getIndex(type);
                        infos.add(index);
                    }
                }
            }
        }
        return infos;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public BigDecimal getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    /**
     * Gets info.
     *
     * @return the info
     */
    public List<Info> getInfo() {
        return info;
    }

    /**
     * Sets info.
     *
     * @param info the info
     */
    public void setInfo(ArrayList<Info> info) {
        this.info = info;
    }

    /**
     * Gets spellcasting ability.
     *
     * @return the spellcasting ability
     */
    public DefaultDataAPI getSpellcasting_ability() {
        return spellcasting_ability;
    }

    /**
     * Sets spellcasting ability.
     *
     * @param spellcasting_ability the spellcasting ability
     */
    public void setSpellcasting_ability(DefaultDataAPI spellcasting_ability) {
        this.spellcasting_ability = spellcasting_ability;
    }

    @Override
    public String toString() {
        return "SpellCasting{" +
                "level=" + level +
                ", info=" + info +
                ", spellcasting_ability=" + spellcasting_ability +
                '}';
    }

    /**
     * The type Spell casting levels.
     */
    public static class SpellCastingLevels {
        private BigDecimal cantrips_known;
        private BigDecimal spells_known;
        private BigDecimal spell_slots_level_1;
        private BigDecimal spell_slots_level_2;
        private BigDecimal spell_slots_level_3;
        private BigDecimal spell_slots_level_4;
        private BigDecimal spell_slots_level_5;
        private BigDecimal spell_slots_level_6;
        private BigDecimal spell_slots_level_7;
        private BigDecimal spell_slots_level_8;
        private BigDecimal spell_slots_level_9;

        /**
         * Gets cantrips known.
         *
         * @return the cantrips known
         */
        public BigDecimal getCantrips_known() {
            return cantrips_known;
        }

        /**
         * Sets cantrips known.
         *
         * @param cantrips_known the cantrips known
         */
        public void setCantrips_known(BigDecimal cantrips_known) {
            this.cantrips_known = cantrips_known;
        }

        /**
         * Gets spells known.
         *
         * @return the spells known
         */
        public BigDecimal getSpells_known() {
            return spells_known;
        }

        /**
         * Sets spells known.
         *
         * @param spells_known the spells known
         */
        public void setSpells_known(BigDecimal spells_known) {
            this.spells_known = spells_known;
        }

        /**
         * Gets spell slots level 1.
         *
         * @return the spell slots level 1
         */
        public BigDecimal getSpell_slots_level_1() {
            return spell_slots_level_1;
        }

        /**
         * Sets spell slots level 1.
         *
         * @param spell_slots_level_1 the spell slots level 1
         */
        public void setSpell_slots_level_1(BigDecimal spell_slots_level_1) {
            this.spell_slots_level_1 = spell_slots_level_1;
        }

        /**
         * Gets spell slots level 2.
         *
         * @return the spell slots level 2
         */
        public BigDecimal getSpell_slots_level_2() {
            return spell_slots_level_2;
        }

        /**
         * Sets spell slots level 2.
         *
         * @param spell_slots_level_2 the spell slots level 2
         */
        public void setSpell_slots_level_2(BigDecimal spell_slots_level_2) {
            this.spell_slots_level_2 = spell_slots_level_2;
        }

        /**
         * Gets spell slots level 3.
         *
         * @return the spell slots level 3
         */
        public BigDecimal getSpell_slots_level_3() {
            return spell_slots_level_3;
        }

        /**
         * Sets spell slots level 3.
         *
         * @param spell_slots_level_3 the spell slots level 3
         */
        public void setSpell_slots_level_3(BigDecimal spell_slots_level_3) {
            this.spell_slots_level_3 = spell_slots_level_3;
        }

        /**
         * Gets spell slots level 4.
         *
         * @return the spell slots level 4
         */
        public BigDecimal getSpell_slots_level_4() {
            return spell_slots_level_4;
        }

        /**
         * Sets spell slots level 4.
         *
         * @param spell_slots_level_4 the spell slots level 4
         */
        public void setSpell_slots_level_4(BigDecimal spell_slots_level_4) {
            this.spell_slots_level_4 = spell_slots_level_4;
        }

        /**
         * Gets spell slots level 5.
         *
         * @return the spell slots level 5
         */
        public BigDecimal getSpell_slots_level_5() {
            return spell_slots_level_5;
        }

        /**
         * Sets spell slots level 5.
         *
         * @param spell_slots_level_5 the spell slots level 5
         */
        public void setSpell_slots_level_5(BigDecimal spell_slots_level_5) {
            this.spell_slots_level_5 = spell_slots_level_5;
        }

        /**
         * Gets spell slots level 6.
         *
         * @return the spell slots level 6
         */
        public BigDecimal getSpell_slots_level_6() {
            return spell_slots_level_6;
        }

        /**
         * Sets spell slots level 6.
         *
         * @param spell_slots_level_6 the spell slots level 6
         */
        public void setSpell_slots_level_6(BigDecimal spell_slots_level_6) {
            this.spell_slots_level_6 = spell_slots_level_6;
        }

        /**
         * Gets spell slots level 7.
         *
         * @return the spell slots level 7
         */
        public BigDecimal getSpell_slots_level_7() {
            return spell_slots_level_7;
        }

        /**
         * Sets spell slots level 7.
         *
         * @param spell_slots_level_7 the spell slots level 7
         */
        public void setSpell_slots_level_7(BigDecimal spell_slots_level_7) {
            this.spell_slots_level_7 = spell_slots_level_7;
        }

        /**
         * Gets spell slots level 8.
         *
         * @return the spell slots level 8
         */
        public BigDecimal getSpell_slots_level_8() {
            return spell_slots_level_8;
        }

        /**
         * Sets spell slots level 8.
         *
         * @param spell_slots_level_8 the spell slots level 8
         */
        public void setSpell_slots_level_8(BigDecimal spell_slots_level_8) {
            this.spell_slots_level_8 = spell_slots_level_8;
        }

        /**
         * Gets spell slots level 9.
         *
         * @return the spell slots level 9
         */
        public BigDecimal getSpell_slots_level_9() {
            return spell_slots_level_9;
        }

        /**
         * Sets spell slots level 9.
         *
         * @param spell_slots_level_9 the spell slots level 9
         */
        public void setSpell_slots_level_9(BigDecimal spell_slots_level_9) {
            this.spell_slots_level_9 = spell_slots_level_9;
        }

        @Override
        public String toString() {
            return "SpellCastingLevels{" +
                    "cantrips_known=" + cantrips_known +
                    ", spells_known=" + spells_known +
                    ", spell_slots_level_1=" + spell_slots_level_1 +
                    ", spell_slots_level_2=" + spell_slots_level_2 +
                    ", spell_slots_level_3=" + spell_slots_level_3 +
                    ", spell_slots_level_4=" + spell_slots_level_4 +
                    ", spell_slots_level_5=" + spell_slots_level_5 +
                    ", spell_slots_level_6=" + spell_slots_level_6 +
                    ", spell_slots_level_7=" + spell_slots_level_7 +
                    ", spell_slots_level_8=" + spell_slots_level_8 +
                    ", spell_slots_level_9=" + spell_slots_level_9 +
                    '}';
        }
    }
}
