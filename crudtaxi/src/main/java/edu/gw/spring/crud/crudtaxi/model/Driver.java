package edu.gw.spring.crud.crudtaxi.model;


import javax.persistence.*;

@Entity
@Table(name = "driver" )
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long drID;
    @Column(name = "dr_name", length = 50, nullable = false)
    private String drName;
    @Column(name = "dr_age", nullable = false)
    private String drAge;
    @Column(name = "dr_phone", nullable = false)
    private String drPhone;
    @Column(name = "dr_address", length = 50, nullable = false)
    private String drAddress;

    public Driver(String drName, String drAge, String drPhone, String drAddress) {
        this.drName = drName;
        this.drAge = drAge;
        this.drPhone = drPhone;
        this.drAddress = drAddress;
    }

    public Driver(){
    }
    public long getDrID() {
        return drID;
    }

    public void setDrID(long drID) {
        this.drID = drID;
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDrAge() {
        return drAge;
    }

    public void setDrAge(String drAge) {
        this.drAge = drAge;
    }

    public String getDrPhone() {
        return drPhone;
    }

    public void setDrPhone(String drPhone) {
        this.drPhone = drPhone;
    }

    public String getDrAddress() {
        return drAddress;
    }

    public void setDrAddress(String drAddress) {
        this.drAddress = drAddress;
    }
}
