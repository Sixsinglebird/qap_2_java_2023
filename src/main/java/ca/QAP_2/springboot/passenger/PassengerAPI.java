package ca.QAP_2.springboot.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "passenger", collectionResourceRel = "passenger")
public interface PassengerAPI extends JpaRepository<Passenger, Long> {
}
