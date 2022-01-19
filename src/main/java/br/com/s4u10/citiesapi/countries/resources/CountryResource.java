package br.com.s4u10.citiesapi.countries.resources;
/**
 *
 * @author s4u1o
 */
import java.util.List;
import br.com.s4u10.citiesapi.countries.entities.Country;
import br.com.s4u10.citiesapi.countries.repositories.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryResource {

    private final CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/countries")
    public List<Country> cities() {

        return repository.findAll();
    }
}