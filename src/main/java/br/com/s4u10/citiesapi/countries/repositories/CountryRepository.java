package br.com.s4u10.citiesapi.countries.repositories;
/**
 *
 * @author s4u1o
 */
import br.com.s4u10.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}