package edu.gw.spring.crud.crudtaxi.model;

import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car {
    @Id
    private long id;
    @Column(name = "car_no" , length = 50, nullable = false)
    private String carNo;
    @Column(name = "license_plate" , length = 50, nullable = false)
    private String license_plate;
    @Column(name = "seat_count" , length = 50, nullable = false)
    private String seat_count;
    @Column(name = "rating" , length = 50, nullable = false)
    private String rating;
    @Column(name = "energy_type" , length = 50, nullable = false)
    private String energy_type;
    @Column (name = "mfID" , nullable = false)
    private long mfID;
    @Column (name = "drID" , nullable = false)
    private long drID;

    public Car(long id, String carNo, String license_plate, String seat_count, String rating, String energy_type, long mfID, long drID) {
        this.id = id;
        this.carNo = carNo;
        this.license_plate = license_plate;
        this.seat_count = seat_count;
        this.rating = rating;
        this.energy_type = energy_type;
        this.mfID = mfID;
        this.drID = drID;
    }
    public Car(){
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(String seat_count) {
        this.seat_count = seat_count;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getEnergy_type() {
        return energy_type;
    }

    public void setEnergy_type(String energy_type) {
        this.energy_type = energy_type;
    }

    public long getMfID() {
        return mfID;
    }

    public void setMfID(long mfID) {
        this.mfID = mfID;
    }

    public long getDrID() {
        return drID;
    }

    public void setDrID(long driverID) {
        this.drID = driverID;
    }
}
