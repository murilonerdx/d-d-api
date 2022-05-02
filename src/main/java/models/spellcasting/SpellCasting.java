package models.spellcasting;


import models.classe.Classe;
import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.path.ClassDataType;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static utils.APIProperties.getServer;

public class SpellCasting {
    private BigDecimal level;
    private List<Info> info;
    private DefaultDataAPI spellcasting_ability;

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    public List<Info>  getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Info>  info) {
        this.info = info;
    }

    public DefaultDataAPI getSpellcasting_ability() {
        return spellcasting_ability;
    }

    public void setSpellcasting_ability(DefaultDataAPI spellcasting_ability) {
        this.spellcasting_ability = spellcasting_ability;
    }

    public static List<SpellCasting> get() throws IOException {
        List<SpellCasting> spell_casting = new ArrayList<>();
        SpellCastingType[] values = SpellCastingType.values();

        for(SpellCastingType type : values){
            SpellCasting index = getIndex(type);
            spell_casting.add(index);
        }

        return spell_casting;
    }

    public static SpellCasting getIndex(SpellCastingType type) throws IOException {
        String path = getServer() + ClassDataType.SPELLCASTING.endpointReplace(type.name());
        return (SpellCasting) RequestAPI.GET(path, SpellCasting.class);
    }

    public static List<SpellCasting> searchSpellCasting(SpellCastingType type) throws Exception {
        Pattern pattern = Pattern.compile(type.name().toLowerCase());
        List<SpellCasting> spellCastings = get();
        List<SpellCasting> infos = new ArrayList<>();
        for(int a = 0; a <= spellCastings.size()-1; a++){
            for (SpellCasting result : get()) {
                for(Info info : result.getInfo()){
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

    @Override
    public String toString() {
        return "SpellCasting{" +
                "level=" + level +
                ", info=" + info +
                ", spellcasting_ability=" + spellcasting_ability +
                '}';
    }
}
