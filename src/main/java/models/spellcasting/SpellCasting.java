package models.spellcasting;


import models.utility.DefaultDataAPI;

import java.math.BigDecimal;
import java.util.Arrays;

public class SpellCasting {
    private BigDecimal level;
    private Info[] info;
    private DefaultDataAPI spellcasting_ability;

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    public Info[] getInfo() {
        return info;
    }

    public void setInfo(Info[] info) {
        this.info = info;
    }

    public DefaultDataAPI getSpellcasting_ability() {
        return spellcasting_ability;
    }

    public void setSpellcasting_ability(DefaultDataAPI spellcasting_ability) {
        this.spellcasting_ability = spellcasting_ability;
    }

    @Override
    public String toString() {
        return "SpellCasting{" +
                "level=" + level +
                ", info=" + Arrays.toString(info) +
                ", spellcasting_ability=" + spellcasting_ability +
                '}';
    }
}
