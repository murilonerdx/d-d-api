package models.spellcasting;

import java.util.Arrays;

/**
 * The type Info.
 */
class Info {
    private String name;
    private String[] desc;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
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
     * Get desc string [ ].
     *
     * @return the string [ ]
     */
    public String[] getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
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
