package models.classe;

import com.google.gson.Gson;
import models.utility.annotations.TypedForge;
import models.equipament.StartEquipment;
import models.proficiency.ProficiencyChoices;
import models.spellcasting.SpellCasting;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.RequestDefaultResource;
import models.utility.path.ClassDataType;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static utils.APIProperties.getServer;

/**
 * The type Classe.
 * A character class is a fundamental part of the identity and nature of characters in the Dungeons & Dragons role-playing game.
 * A character's capabilities, strengths, and weaknesses are largely defined by its class.
 * A character's class affects a character's available skills and abilities. [SRD p8-55]
 */
@TypedForge(name="classe", forge= ClasseType.class)
public class Classe extends DefaultDataAPI {
    private BigDecimal hit_die;
    private String class_levels;
    private MultiClasse multi_classing;
    private SpellCasting spellcasting;
    private String spells;
    private StartEquipment[] starting_equipment;
    private StartEquipment.StartingEquipmentOptions[] starting_equipment_options;
    private ProficiencyChoices proficiency_choises;
    private DefaultDataAPI[] proficiencies;
    private DefaultDataAPI[] saving_throws;
    private DefaultDataAPI[] subclasses;

    /**
     * Get classe.
     *
     * @param url the url
     * @return the classe
     */
    public static Classe get(String url) {
        return new Gson().fromJson(new RestTemplate().getForEntity(url + ClassDataType.CLASSES.getEndpoint(), String.class).getBody(), Classe.class);
    }

    /**
     * Get request default resource.
     *
     * @return the request default resource
     * @throws IOException the io exception
     */
    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + ClassDataType.CLASSES.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static Classe getIndex(ClasseType type) throws IOException {
        String path = getServer() + ClassDataType.CLASSES.getEndpoint() + type.name();
        return (Classe) RequestAPI.GET(path, Classe.class);
    }

    /**
     * Search classe list.
     *
     * @param type the type
     * @return the list
     * @throws Exception the exception
     */
    public static List<Classe> searchClasse(ClasseType type) throws Exception {
        List<Classe> dda = new ArrayList<>();
        Pattern pattern = Pattern.compile(type.name().toLowerCase());

        for (DefaultDataAPI result : get().getResults()) {
            Matcher match = pattern.matcher(result.getName().toLowerCase());
            while (match.find()) {
                Classe index = getIndex(type);
                dda.add(index);
            }
        }
        return dda;
    }

    /**
     * Gets hit die.
     *
     * @return the hit die
     */
    public BigDecimal getHit_die() {
        return hit_die;
    }

    /**
     * Sets hit die.
     *
     * @param hit_die the hit die
     */
    public void setHit_die(BigDecimal hit_die) {
        this.hit_die = hit_die;
    }

    /**
     * Gets class levels.
     *
     * @return the class levels
     */
    public String getClass_levels() {
        return class_levels;
    }

    /**
     * Sets class levels.
     *
     * @param class_levels the class levels
     */
    public void setClass_levels(String class_levels) {
        this.class_levels = class_levels;
    }

    /**
     * Gets multi classing.
     *
     * @return the multi classing
     */
    public MultiClasse getMulti_classing() {
        return multi_classing;
    }

    /**
     * Gets spellcasting.
     *
     * @return the spellcasting
     */
    public SpellCasting getSpellcasting() {
        return spellcasting;
    }

    /**
     * Sets spellcasting.
     *
     * @param spellcasting the spellcasting
     */
    public void setSpellcasting(SpellCasting spellcasting) {
        this.spellcasting = spellcasting;
    }

    /**
     * Gets spells.
     *
     * @return the spells
     */
    public String getSpells() {
        return spells;
    }

    /**
     * Sets spells.
     *
     * @param spells the spells
     */
    public void setSpells(String spells) {
        this.spells = spells;
    }

    /**
     * Get starting equipment start equipment [ ].
     *
     * @return the start equipment [ ]
     */
    public StartEquipment[] getStarting_equipment() {
        return starting_equipment;
    }

    /**
     * Sets starting equipment.
     *
     * @param starting_equipment the starting equipment
     */
    public void setStarting_equipment(StartEquipment[] starting_equipment) {
        this.starting_equipment = starting_equipment;
    }

    /**
     * Get starting equipment options start equipment . starting equipment options [ ].
     *
     * @return the start equipment . starting equipment options [ ]
     */
    public StartEquipment.StartingEquipmentOptions[] getStarting_equipment_options() {
        return starting_equipment_options;
    }

    /**
     * Sets starting equipment options.
     *
     * @param starting_equipment_options the starting equipment options
     */
    public void setStarting_equipment_options(StartEquipment.StartingEquipmentOptions[] starting_equipment_options) {
        this.starting_equipment_options = starting_equipment_options;
    }

    /**
     * Gets proficiency choises.
     *
     * @return the proficiency choises
     */
    public ProficiencyChoices getProficiency_choises() {
        return proficiency_choises;
    }

    /**
     * Sets proficiency choises.
     *
     * @param proficiency_choises the proficiency choises
     */
    public void setProficiency_choises(ProficiencyChoices proficiency_choises) {
        this.proficiency_choises = proficiency_choises;
    }

    /**
     * Get proficiencies default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getProficiencies() {
        return proficiencies;
    }

    /**
     * Sets proficiencies.
     *
     * @param proficiencies the proficiencies
     */
    public void setProficiencies(DefaultDataAPI[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    /**
     * Get saving throws default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getSaving_throws() {
        return saving_throws;
    }

    /**
     * Sets saving throws.
     *
     * @param saving_throws the saving throws
     */
    public void setSaving_throws(DefaultDataAPI[] saving_throws) {
        this.saving_throws = saving_throws;
    }

    /**
     * Get subclasses default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getSubclasses() {
        return subclasses;
    }

    /**
     * Sets multi classing.
     *
     * @param multi_classing the multi classing
     */
    public void setMulti_classing(MultiClasse multi_classing) {
        this.multi_classing = multi_classing;
    }

    /**
     * Sets subclasses.
     *
     * @param subclasses the subclasses
     */
    public void setSubclasses(DefaultDataAPI[] subclasses) {
        this.subclasses = subclasses;
    }

    @Override
    public String toString() {
        return "Class{" +
                "hit_die=" + hit_die +
                ", class_levels='" + class_levels + '\'' +
                ", multi_classing=" + multi_classing +
                ", spellcasting=" + spellcasting +
                ", spells='" + spells + '\'' +
                ", starting_equipment=" + Arrays.toString(starting_equipment) +
                ", starting_equipment_options=" + Arrays.toString(starting_equipment_options) +
                ", proficiency_choises=" + proficiency_choises +
                ", proficiencies=" + Arrays.toString(proficiencies) +
                ", saving_throws=" + Arrays.toString(saving_throws) +
                ", subclasses=" + Arrays.toString(subclasses) +
                '}';
    }
}
