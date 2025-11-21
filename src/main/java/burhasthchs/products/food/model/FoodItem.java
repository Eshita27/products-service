@Document(collection = "food_items")
public class FoodItem {
    @Id
    private String id;
    private String name;
    private String category; // sandwich, burger, etc.
    private List<String> ingredients;
    private boolean isVegan;
}