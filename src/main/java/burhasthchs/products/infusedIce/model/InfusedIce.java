@Document(collection = "infused_ice")
public class InfusedIce {
    @Id
    private String id;
    private String drinkName;
    private String iceType;
    private boolean alcoholCompatible;
    private boolean giftBundleAvailable;
}