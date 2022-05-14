package models.rule;

import models.utility.DefaultDataAPI;
import models.utility.RequestAPI;
import models.utility.annotations.TypedForge;
import models.utility.path.ClassFeatType;

import java.io.IOException;
import java.util.Arrays;

import static utils.APIProperties.getServer;

/**
 * The type Rule.
 * Rules are pages in the SRD that document the mechanics of Dungeons and Dragons.
 * Rules have descriptions which is the text directly underneath the rule heading in the SRD.
 * Rules also have subsections for each heading underneath the rule in the SRD.
 */
@TypedForge(name="rule_sections", forge= RuleSectionTypes.class)
public class Rule extends DefaultDataAPI {
    private String desc;
    private DefaultDataAPI[] subsections;

    /**
     * Get subsections default data api [ ].
     *
     * @return the default data api [ ]
     */
    public DefaultDataAPI[] getSubsections() {
        return subsections;
    }

    /**
     * Sets subsections.
     *
     * @param subsections the subsections
     */
    public void setSubsections(DefaultDataAPI[] subsections) {
        this.subsections = subsections;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "index=" + getIndex() +
                ", name=" + getName() +
                ", url=" + getUrl() +
                ", desc='" + desc + '\'' +
                ", subsections=" + Arrays.toString(subsections) +
                '}';
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Rule getIndexSection(RuleSectionTypes index) throws IOException {
        String path = getServer() + ClassFeatType.RULES_SECTIONS.endpointReplace(index.getName(index));
        return (Rule) RequestAPI.GET(path, Rule.class);
    }

    /**
     * Gets index.
     *
     * @param index the index
     * @return the index
     * @throws IOException the io exception
     */
    public static Rule getIndex(RuleType index) throws IOException {
        String path = getServer() + ClassFeatType.RULES.endpointReplace(index.getName(index));
        return (Rule) RequestAPI.GET(path, Rule.class);
    }
}
