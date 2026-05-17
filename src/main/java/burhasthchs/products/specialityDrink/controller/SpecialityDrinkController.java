package burhasthchs.products.specialityDrink.controller;

import burhasthchs.products.specialityDrink.service.SpecialityDrinkService;
import burhasthchs.products.specialityDrink.model.SpecialityDrink;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/speciality-drink")
@Tag(name = "Speciality Drink")
public class SpecialityDrinkController {
    @Autowired
    private SpecialityDrinkService service;

    @GetMapping
    @Operation(summary = "Get all infused ice options")
    public List<SpecialityDrink> getAll() {
        return service.getAll();
    }
}
