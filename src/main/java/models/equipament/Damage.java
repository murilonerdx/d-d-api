package models.equipament;

import models.utility.DefaultDataAPI;

public class Damage {
    private String damage_dice;
    private DamageType damage_type;

    public String getDamage_dice() {
        return damage_dice;
    }

    public void setDamage_dice(String damage_dice) {
        this.damage_dice = damage_dice;
    }

    public DamageType getDamage_type() {
        return damage_type;
    }

    public void setDamage_type(DamageType damage_type) {
        this.damage_type = damage_type;
    }

    static class DamageType extends DefaultDataAPI {
    }

}
