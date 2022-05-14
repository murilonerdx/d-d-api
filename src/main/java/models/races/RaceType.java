package models.races;

import models.equipament.enums.WeaponPropertyType;

public enum RaceType {
    dragonborn,
    dwarf,
    elf,
    gnome,
    half_elf,
    half_orc,
    halfling,
    human,
    tiefling;

    public String getName(RaceType raceType){
        return raceType.name().replace("_", "-");
    }
}
