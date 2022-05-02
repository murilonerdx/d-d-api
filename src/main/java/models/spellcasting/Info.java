package models.spellcasting;

import java.util.Arrays;

class Info {
    private String name;
    private String[] desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getDesc() {
        return desc;
    }

    public void setDesc(String[] desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", desc=" + Arrays.toString(desc) +
                '}';
    }
}
