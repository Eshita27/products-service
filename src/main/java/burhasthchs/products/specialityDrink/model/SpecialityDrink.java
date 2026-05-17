package burhasthchs.products.specialityDrink.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "special_drinks")
public class SpecialityDrink {
    @Id
    private String id;
    private String name;
    private String tagline;
    private boolean limitedEdition;
    private boolean dealCompatible;

    public SpecialityDrink() {}

    public SpecialityDrink(String id, String name, String tagline, boolean limitedEdition, boolean dealCompatible) {
        this.id = id;
        this.name = name;
        this.tagline = tagline;
        this.limitedEdition = limitedEdition;
        this.dealCompatible = dealCompatible;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getTagline() { return tagline; }
    public void setTagline(String tagline) { this.tagline = tagline; }

    public boolean isLimitedEdition() { return limitedEdition; }
    public void setLimitedEdition(boolean limitedEdition) { this.limitedEdition = limitedEdition; }

    public boolean isDealCompatible() { return dealCompatible; }
    public void setDealCompatible(boolean dealCompatible) { this.dealCompatible = dealCompatible; }

    @Override
    public String toString() {
        return "SpecialityDrink{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tagline='" + tagline + '\'' +
                ", limitedEdition=" + limitedEdition +
                ", dealCompatible=" + dealCompatible +
                '}';
    }
}
