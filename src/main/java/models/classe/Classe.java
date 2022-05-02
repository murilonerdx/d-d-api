package models.classe;

import com.google.gson.Gson;
import models.proficiency.Proficiency;
import models.proficiency.ProficiencyChoices;
import models.equipament.StartEquipment;
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

    public BigDecimal getHit_die() {
        return hit_die;
    }

    public void setHit_die(BigDecimal hit_die) {
        this.hit_die = hit_die;
    }

    public String getClass_levels() {
        return class_levels;
    }

    public void setClass_levels(String class_levels) {
        this.class_levels = class_levels;
    }

    public MultiClasse getMulti_classing() {
        return multi_classing;
    }

    public SpellCasting getSpellcasting() {
        return spellcasting;
    }

    public void setSpellcasting(SpellCasting spellcasting) {
        this.spellcasting = spellcasting;
    }

    public String getSpells() {
        return spells;
    }

    public void setSpells(String spells) {
        this.spells = spells;
    }

    public StartEquipment[] getStarting_equipment() {
        return starting_equipment;
    }

    public void setStarting_equipment(StartEquipment[] starting_equipment) {
        this.starting_equipment = starting_equipment;
    }

    public StartEquipment.StartingEquipmentOptions[] getStarting_equipment_options() {
        return starting_equipment_options;
    }

    public void setStarting_equipment_options(StartEquipment.StartingEquipmentOptions[] starting_equipment_options) {
        this.starting_equipment_options = starting_equipment_options;
    }

    public ProficiencyChoices getProficiency_choises() {
        return proficiency_choises;
    }

    public void setProficiency_choises(ProficiencyChoices proficiency_choises) {
        this.proficiency_choises = proficiency_choises;
    }

    public DefaultDataAPI[] getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(DefaultDataAPI[] proficiencies) {
        this.proficiencies = proficiencies;
    }

    public DefaultDataAPI[] getSaving_throws() {
        return saving_throws;
    }

    public void setSaving_throws(DefaultDataAPI[] saving_throws) {
        this.saving_throws = saving_throws;
    }

    public DefaultDataAPI[] getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(DefaultDataAPI[] subclasses) {
        this.subclasses = subclasses;
    }

    public static Classe get(String url){
        return new Gson().fromJson(new RestTemplate().getForEntity(url + ClassDataType.CLASSES.getEndpoint(), String.class).getBody(), Classe.class);
    }

    public static RequestDefaultResource get() throws IOException {
        String path = getServer() + ClassDataType.CLASSES.getEndpoint();
        return RequestAPI.GETs(path, RequestDefaultResource[].class);
    }

    public static Classe getIndex(ClasseType type) throws IOException {
        String path = getServer() + ClassDataType.CLASSES.getEndpoint() + type.name();
        return (Classe) RequestAPI.GET(path, Classe.class);
    }

    public static List<Classe> searchClasse(ClasseType type) throws Exception {
        List<Classe> dda = new ArrayList<>();
        Pattern pattern = Pattern.compile(type.name().toLowerCase());

        for (DefaultDataAPI result : get().getResults()) {
            Matcher match = pattern.matcher(result.getName().toLowerCase());
            while(match.find()){
                Classe index = getIndex(type);
                dda.add(index);
            }
        }
        return dda;
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
