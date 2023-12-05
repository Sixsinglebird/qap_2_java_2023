package ca.QAP_2.springboot.aircraft;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "aircraft",collectionResourceRel = "aircraft")
public interface AircraftRESTAPI extends JpaRepository<Aircraft, Long> {
}
