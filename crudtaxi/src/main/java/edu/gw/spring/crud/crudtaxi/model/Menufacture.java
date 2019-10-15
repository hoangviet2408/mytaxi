package edu.gw.spring.crud.crudtaxi.model;

import javax.persistence.*;

@Entity
@Table (name="menu_facture")
public class Menufacture {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long mfID;
    @Column(name = "mf_name" , length = 50, nullable = false)
    private String mfName;
    @Column(name = "mf_code" , length = 50, nullable = false)
    private String mfCode;

    public Menufacture(long mfID, String mfName, String mfCode) {
        this.mfID = mfID;
        this.mfName = mfName;
        this.mfCode = mfCode;
    }

    public Menufacture() {

    }

    public long getMfID() {
        return mfID;
    }

    public void setMfID(long mfID) {
        this.mfID = mfID;
    }

    public String getMfName() {
        return mfName;
    }

    public void setMfName(String mfName) {
        this.mfName = mfName;
    }

    public String getMfCode() {
        return mfCode;
    }

    public void setMfCode(String mfCode) {
        this.mfCode = mfCode;
    }

    @Override
    public String toString(){
        return this.getMfID() + "," + this.getMfName() + "," + this.getMfCode() ;
    }
}
