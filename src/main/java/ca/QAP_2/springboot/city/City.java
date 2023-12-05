package ca.QAP_2.springboot.city;

import ca.QAP_2.springboot.airport.Airport;
import ca.QAP_2.springboot.passenger.Passenger;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class City {
    @Id
    @SequenceGenerator(name = "city_sequence", sequenceName = "city_sequence",initialValue = 1,allocationSize = 1)
    @GeneratedValue(generator = "city_sequence")
    private long id;

    private String name;

    private String province;

    @OneToMany
    private List<Passenger> habitants;

    @OneToMany
    private List<Airport> airports;

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public List<Passenger> getHabitants() {
        return habitants;
    }

    public void setHabitants(List<Passenger> habitants) {
        this.habitants = habitants;
    }
}
