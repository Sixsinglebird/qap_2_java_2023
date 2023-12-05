package ca.QAP_2.springboot.aircraft;

import ca.QAP_2.springboot.airport.Airport;
import ca.QAP_2.springboot.passenger.Passenger;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Aircraft {
    @Id
    @SequenceGenerator(name = "aircraft_sequence", sequenceName = "aircraft_sequence",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "aircraft_sequence")
    private long id;

    private String type;

    private String airlineName;

    private String model;

    @OneToMany
    private List<Passenger> passengers;

    @OneToMany
    private List<Airport> availableAirports;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<Airport> getAvailableAirports() {
        return availableAirports;
    }

    public void setAvailableAirports(List<Airport> availableAirports) {
        this.availableAirports = availableAirports;
    }
}
