@RestController
@RequestMapping("/api/food")
@Tag(name = "Food")
public class FoodItemController {
    @Autowired
    private FoodItemService service;

    @GetMapping
    @Operation(summary = "Get all food item options")
    public List<FoodItem> getAll() {
        return service.getAll();
    }
}