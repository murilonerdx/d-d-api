package models.equipament.enums;

public enum WeaponPropertyType {
    ammunition,
    finesse,
    heavy,
    light,
    loading,
    monk,
    reach,
    special,
    thrown,
    two_handed,
    versatile;

    public String getName(WeaponPropertyType weaponPropertyType){
        return weaponPropertyType.name().replace("_", "-");
    }
}
