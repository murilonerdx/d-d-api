package models.races;

import models.monsters.Monster;
import models.monsters.MonsterFull;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassFeatType;

import java.io.IOException;
import java.util.ArrayList;

import static utils.APIProperties.getServer;

/**
 * The type Race.
 * Each race grants your character ability and skill bonuses as well as racial traits.
 */
@TypedForge(name="race", forge= RaceType.class)
public class Race extends DefaultDataAPI {

    /**
     * The Ability bonuses.
     */
    ArrayList<Object> ability_bonuses = new ArrayList<Object>();
    private String age;
    private String alignment;
    private String language_desc;
    /**
     * The Languages.
     */
    ArrayList<Object> languages = new ArrayList<Object>();
    private String size;
    private String size_description;
    private float speed;
    /**
     * The Starting proficiencies.
     */
    ArrayList<Object> starting_proficiencies = new ArrayList<Object>();
    /**
     * The Subraces.
     */
    ArrayList<Object> subraces = new ArrayList<Object>();
    /**
     * The Traits.
     */
    ArrayList<Object> traits = new ArrayList<Object>();

    /**
     * Gets age.
     *
     * @return the age
     */
    public String getAge() {
        return age;
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
     * Gets language desc.
     *
     * @return the language desc
     */
    public String getLanguage_desc() {
        return language_desc;
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
     * Gets size description.
     *
     * @return the size description
     */
    public String getSize_description() {
        return size_description;
    }

    /**
     * Gets speed.
     *
     * @return the speed
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(String age) {
        this.age = age;
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
     * Sets language desc.
     *
     * @param language_desc the language desc
     */
    public void setLanguage_desc(String language_desc) {
        this.language_desc = language_desc;
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
     * Sets size description.
     *
     * @param size_description the size description
     */
    public void setSize_description(String size_description) {
        this.size_description = size_description;
    }

    /**
     * Sets speed.
     *
     * @param speed the speed
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public ArrayList<Object> getAbility_bonuses() {
        return ability_bonuses;
    }

    public void setAbility_bonuses(ArrayList<Object> ability_bonuses) {
        this.ability_bonuses = ability_bonuses;
    }

    public ArrayList<Object> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Object> languages) {
        this.languages = languages;
    }

    public ArrayList<Object> getStarting_proficiencies() {
        return starting_proficiencies;
    }

    public void setStarting_proficiencies(ArrayList<Object> starting_proficiencies) {
        this.starting_proficiencies = starting_proficiencies;
    }

    public ArrayList<Object> getSubraces() {
        return subraces;
    }

    public void setSubraces(ArrayList<Object> subraces) {
        this.subraces = subraces;
    }

    public ArrayList<Object> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<Object> traits) {
        this.traits = traits;
    }

    @Override
    public String toString() {
        return "Race{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", ability_bonuses=" + ability_bonuses +
                ", age='" + age + '\'' +
                ", alignment='" + alignment + '\'' +
                ", language_desc='" + language_desc + '\'' +
                ", languages=" + languages +
                ", size='" + size + '\'' +
                ", size_description='" + size_description + '\'' +
                ", speed=" + speed +
                ", starting_proficiencies=" + starting_proficiencies +
                ", subraces=" + subraces +
                ", traits=" + traits +
                '}';
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Race getIndex(RaceType index) throws IOException {
        String path = getServer() + ClassFeatType.RACES.endpointReplace(index.getName(index));
        return (Race) RequestAPI.GET(path, Race.class);
    }

    public static RequestDefaultResource getIndexSubraces(RaceType index) throws IOException {
        String path = getServer() + ClassFeatType.RACES.endpointReplace(index.getName(index)) + "/subraces";
        return (RequestDefaultResource) RequestAPI.GET(path, RequestDefaultResource.class);
    }

    public static RequestDefaultResource getIndexProficiencies(RaceType index) throws IOException {
        String path = getServer() + ClassFeatType.RACES.endpointReplace(index.getName(index)) + "/proficiencies";
        return (RequestDefaultResource) RequestAPI.GET(path, RequestDefaultResource.class);
    }

    public static RequestDefaultResource getIndexTraits(RaceType index) throws IOException {
        String path = getServer() + ClassFeatType.RACES.endpointReplace(index.getName(index)) + "/traits";
        return (RequestDefaultResource) RequestAPI.GET(path, RequestDefaultResource.class);
    }


}
