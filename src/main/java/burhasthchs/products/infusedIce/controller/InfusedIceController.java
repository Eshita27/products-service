@RestController
@RequestMapping("/api/infused-ice")
@Tag(name = "Infused Ice")
public class InfusedIceController {
    @Autowired
    private InfusedIceService service;

    @GetMapping
    @Operation(summary = "Get all infused ice options")
    public List<InfusedIce> getAll() {
        return service.getAll();
    }
}