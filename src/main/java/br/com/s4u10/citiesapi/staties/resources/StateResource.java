package br.com.s4u10.citiesapi.staties.resources;

/**
 *
 * @author s4u1o
 */
import java.util.List;
import br.com.s4u10.citiesapi.staties.entities.State;
import br.com.s4u10.citiesapi.staties.repositories.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    private final StateRepository repository;

    public StateResource(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> states() {
        return repository.findAll();
    }
}