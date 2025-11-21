@Service
public class FoodItemService {
    @Autowired
    private FoodRepository repo;

    public List<FoodItem> getAll() { return repo.findAll(); }
}