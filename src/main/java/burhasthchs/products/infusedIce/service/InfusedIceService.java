@Service
public class InfusedIceService {
    @Autowired
    private InfusedIceRepository repo;

    public List<InfusedIce> getAll() { return repo.findAll(); }
}