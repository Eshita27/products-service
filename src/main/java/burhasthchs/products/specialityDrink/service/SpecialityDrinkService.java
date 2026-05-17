package burhasthchs.products.specialityDrink.service;

import burhasthchs.products.specialityDrink.model.SpecialityDrink;
import burhasthchs.products.specialityDrink.repository.SpecialityDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SpecialityDrinkService {
    @Autowired
    private SpecialityDrinkRepository repo;

    public List<SpecialityDrink> getAll() { return repo.findAll(); }
}
