package models.classe.spell;

import models.classe.ClasseType;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static utils.APIProperties.getServer;

public class SpellHability extends DefaultDataAPI {
    private String attack_type;
    private String casting_time;
    ArrayList<DefaultDataAPI> classes = new ArrayList<DefaultDataAPI>();
    ArrayList<Object> components = new ArrayList<Object>();
    private boolean concentration;
    private Object damage;
    private Dc dc;
    private String[] desc;
    private String duration;
    private String higher_lever;
    private int level;
    private String trange;
    private boolean ritual;
    private DefaultDataAPI school;
    private DefaultDataAPI[] subclasses;

    public String getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(String attack_type) {
        this.attack_type = attack_type;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public void setCasting_time(String casting_time) {
        this.casting_time = casting_time;
    }

    public ArrayList<DefaultDataAPI> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<DefaultDataAPI> classes) {
        this.classes = classes;
    }

    public ArrayList<Object> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Object> components) {
        this.components = components;
    }

    public boolean isConcentration() {
        return concentration;
    }

    public void setConcentration(boolean concentration) {
        this.concentration = concentration;
    }

    public Object getDamage() {
        return damage;
    }

    public void setDamage(Object damage) {
        this.damage = damage;
    }

    public Dc getDc() {
        return dc;
    }

    public void setDc(Dc dc) {
        this.dc = dc;
    }

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getHigher_lever() {
        return higher_lever;
    }

    public void setHigher_lever(String higher_lever) {
        this.higher_lever = higher_lever;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getTrange() {
        return trange;
    }

    public void setTrange(String trange) {
        this.trange = trange;
    }

    public boolean isRitual() {
        return ritual;
    }

    public void setRitual(boolean ritual) {
        this.ritual = ritual;
    }

    public DefaultDataAPI getSchool() {
        return school;
    }

    public void setSchool(DefaultDataAPI school) {
        this.school = school;
    }

    public DefaultDataAPI[] getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(DefaultDataAPI[] subclasses) {
        this.subclasses = subclasses;
    }

    @Override
    public String toString() {
        return "SpellHability{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", attack_type='" + attack_type + '\'' +
                ", casting_time='" + casting_time + '\'' +
                ", classes=" + classes +
                ", components=" + components +
                ", concentration=" + concentration +
                ", damage=" + damage +
                ", dc=" + dc +
                ", desc=" + Arrays.toString(desc) +
                ", duration='" + duration + '\'' +
                ", higher_lever='" + higher_lever + '\'' +
                ", level=" + level +
                ", trange='" + trange + '\'' +
                ", ritual=" + ritual +
                ", school=" + school +
                ", subclasses=" + Arrays.toString(subclasses) +
                '}';
    }

    /**
     * Gets index.
     *
     * @param type the type
     * @return the index
     * @throws IOException the io exception
     */
    public static SpellHability getIndex(String type) throws IOException {
        String path = getServer() + ClassDataType.SPELLS.endpointReplace(type);
        return (SpellHability) RequestAPI.GET(path, SpellHability.class);
    }

    static class Dc{
        private String dc_success;
        private DefaultDataAPI dc_type;

        public DefaultDataAPI getDc_type() {
            return dc_type;
        }

        public void setDc_type(DefaultDataAPI dc_type) {
            this.dc_type = dc_type;
        }

        public String getDc_success() {
            return dc_success;
        }

        public void setDc_success(String dc_success) {
            this.dc_success = dc_success;
        }

        @Override
        public String toString() {
            return "Dc{" +
                    "dc_success='" + dc_success + '\'' +
                    ", dc_type=" + dc_type +
                    '}';
        }
    }
}
