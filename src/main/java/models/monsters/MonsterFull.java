package models.monsters;

import java.util.ArrayList;

/**
 * The type Monster full.
 */
public class MonsterFull {
    private String index;
    private String name;
    private String url;
    /**
     * The Actions.
     */
    ArrayList<Object> actions = new ArrayList<Object>();
    private String alignment;
    private float armor_class;
    private float challenge_rating;
    private float charisma;
    /**
     * The Condition immunities.
     */
    ArrayList<Object> condition_immunities = new ArrayList<Object>();
    private float constitution;
    /**
     * The Damage immunities.
     */
    ArrayList<Object> damage_immunities = new ArrayList<Object>();
    /**
     * The Damage resistances.
     */
    ArrayList<Object> damage_resistances = new ArrayList<Object>();
    /**
     * The Damage vulnerabilities.
     */
    ArrayList<Object> damage_vulnerabilities = new ArrayList<Object>();
    private float dexterity;
    /**
     * The Forms.
     */
    ArrayList<Object> forms = new ArrayList<Object>();
    private String hit_dice;
    private float hit_points;
    private float intelligence;
    private String languages;
    /**
     * The Legendary actions.
     */
    ArrayList<Object> legendary_actions = new ArrayList<Object>();
    /**
     * The Proficiencies.
     */
    ArrayList<Object> proficiencies = new ArrayList<Object>();
    /**
     * The Reactions.
     */
    ArrayList<Object> reactions = new ArrayList<Object>();
    /**
     * The Senses object.
     */
    Senses SensesObject;
    private String size;
    /**
     * The Special abilities.
     */
    ArrayList<Object> special_abilities = new ArrayList<Object>();
    /**
     * The Speed object.
     */
    Speed SpeedObject;
    private float strength;
    private String subtype = null;
    private String type;
    private float wisdom;
    private float xp;


    // Getter Methods

    /**
     * Gets index.
     *
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Gets alignment.
     *
     * @return the alignment
     */
    public String getAlignment() {
        return alignment;
    }

    /**
     * Gets armor class.
     *
     * @return the armor class
     */
    public float getArmor_class() {
        return armor_class;
    }

    /**
     * Gets challenge rating.
     *
     * @return the challenge rating
     */
    public float getChallenge_rating() {
        return challenge_rating;
    }

    /**
     * Gets charisma.
     *
     * @return the charisma
     */
    public float getCharisma() {
        return charisma;
    }

    /**
     * Gets constitution.
     *
     * @return the constitution
     */
    public float getConstitution() {
        return constitution;
    }

    /**
     * Gets dexterity.
     *
     * @return the dexterity
     */
    public float getDexterity() {
        return dexterity;
    }

    /**
     * Gets hit dice.
     *
     * @return the hit dice
     */
    public String getHit_dice() {
        return hit_dice;
    }

    /**
     * Gets hit points.
     *
     * @return the hit points
     */
    public float getHit_points() {
        return hit_points;
    }

    /**
     * Gets intelligence.
     *
     * @return the intelligence
     */
    public float getIntelligence() {
        return intelligence;
    }

    /**
     * Gets languages.
     *
     * @return the languages
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * Gets senses.
     *
     * @return the senses
     */
    public Senses getSenses() {
        return SensesObject;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * Gets speed.
     *
     * @return the speed
     */
    public Speed getSpeed() {
        return SpeedObject;
    }

    /**
     * Gets strength.
     *
     * @return the strength
     */
    public float getStrength() {
        return strength;
    }

    /**
     * Gets subtype.
     *
     * @return the subtype
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Gets wisdom.
     *
     * @return the wisdom
     */
    public float getWisdom() {
        return wisdom;
    }

    /**
     * Gets xp.
     *
     * @return the xp
     */
    public float getXp() {
        return xp;
    }

    /**
     * Sets index.
     *
     * @param index the index
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets url.
     *
     * @param url the url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets alignment.
     *
     * @param alignment the alignment
     */
    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    /**
     * Sets armor class.
     *
     * @param armor_class the armor class
     */
    public void setArmor_class(float armor_class) {
        this.armor_class = armor_class;
    }

    /**
     * Sets challenge rating.
     *
     * @param challenge_rating the challenge rating
     */
    public void setChallenge_rating(float challenge_rating) {
        this.challenge_rating = challenge_rating;
    }

    /**
     * Sets charisma.
     *
     * @param charisma the charisma
     */
    public void setCharisma(float charisma) {
        this.charisma = charisma;
    }

    /**
     * Sets constitution.
     *
     * @param constitution the constitution
     */
    public void setConstitution(float constitution) {
        this.constitution = constitution;
    }

    /**
     * Sets dexterity.
     *
     * @param dexterity the dexterity
     */
    public void setDexterity(float dexterity) {
        this.dexterity = dexterity;
    }

    /**
     * Sets hit dice.
     *
     * @param hit_dice the hit dice
     */
    public void setHit_dice(String hit_dice) {
        this.hit_dice = hit_dice;
    }

    /**
     * Sets hit points.
     *
     * @param hit_points the hit points
     */
    public void setHit_points(float hit_points) {
        this.hit_points = hit_points;
    }

    /**
     * Sets intelligence.
     *
     * @param intelligence the intelligence
     */
    public void setIntelligence(float intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Sets languages.
     *
     * @param languages the languages
     */
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    /**
     * Sets senses.
     *
     * @param sensesObject the senses object
     */
    public void setSenses(Senses sensesObject) {
        this.SensesObject = sensesObject;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Sets speed.
     *
     * @param speedObject the speed object
     */
    public void setSpeed(Speed speedObject) {
        this.SpeedObject = speedObject;
    }

    /**
     * Sets strength.
     *
     * @param strength the strength
     */
    public void setStrength(float strength) {
        this.strength = strength;
    }

    /**
     * Sets subtype.
     *
     * @param subtype the subtype
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets wisdom.
     *
     * @param wisdom the wisdom
     */
    public void setWisdom(float wisdom) {
        this.wisdom = wisdom;
    }

    /**
     * Sets xp.
     *
     * @param xp the xp
     */
    public void setXp(float xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "MonsterFull{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", actions=" + actions +
                ", alignment='" + alignment + '\'' +
                ", armor_class=" + armor_class +
                ", challenge_rating=" + challenge_rating +
                ", charisma=" + charisma +
                ", condition_immunities=" + condition_immunities +
                ", constitution=" + constitution +
                ", damage_immunities=" + damage_immunities +
                ", damage_resistances=" + damage_resistances +
                ", damage_vulnerabilities=" + damage_vulnerabilities +
                ", dexterity=" + dexterity +
                ", forms=" + forms +
                ", hit_dice='" + hit_dice + '\'' +
                ", hit_points=" + hit_points +
                ", intelligence=" + intelligence +
                ", languages='" + languages + '\'' +
                ", legendary_actions=" + legendary_actions +
                ", proficiencies=" + proficiencies +
                ", reactions=" + reactions +
                ", SensesObject=" + SensesObject +
                ", size='" + size + '\'' +
                ", special_abilities=" + special_abilities +
                ", SpeedObject=" + SpeedObject +
                ", strength=" + strength +
                ", subtype='" + subtype + '\'' +
                ", type='" + type + '\'' +
                ", wisdom=" + wisdom +
                ", xp=" + xp +
                '}';
    }

    class Speed {
        private String swim;
        private String walk;


        // Getter Methods

        /**
         * Gets swim.
         *
         * @return the swim
         */
        public String getSwim() {
            return swim;
        }

        /**
         * Gets walk.
         *
         * @return the walk
         */
        public String getWalk() {
            return walk;
        }

        // Setter Methods

        /**
         * Sets swim.
         *
         * @param swim the swim
         */
        public void setSwim(String swim) {
            this.swim = swim;
        }

        /**
         * Sets walk.
         *
         * @param walk the walk
         */
        public void setWalk(String walk) {
            this.walk = walk;
        }

        @Override
        public String toString() {
            return "Speed{" +
                    "swim='" + swim + '\'' +
                    ", walk='" + walk + '\'' +
                    '}';
        }
    }

    class Senses {
        private String darkvision;
        private float passive_perception;


        // Getter Methods

        /**
         * Gets darkvision.
         *
         * @return the darkvision
         */
        public String getDarkvision() {
            return darkvision;
        }

        /**
         * Gets passive perception.
         *
         * @return the passive perception
         */
        public float getPassive_perception() {
            return passive_perception;
        }

        // Setter Methods

        /**
         * Sets darkvision.
         *
         * @param darkvision the darkvision
         */
        public void setDarkvision(String darkvision) {
            this.darkvision = darkvision;
        }

        /**
         * Sets passive perception.
         *
         * @param passive_perception the passive perception
         */
        public void setPassive_perception(float passive_perception) {
            this.passive_perception = passive_perception;
        }

        @Override
        public String toString() {
            return "Senses{" +
                    "darkvision='" + darkvision + '\'' +
                    ", passive_perception=" + passive_perception +
                    '}';
        }
    }
}
