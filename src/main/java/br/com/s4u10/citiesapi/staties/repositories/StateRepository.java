package br.com.s4u10.citiesapi.staties.repositories;
/**
 *
 * @author s4u1o
 */
import br.com.s4u10.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface    StateRepository extends JpaRepository<State, Long> {
}
