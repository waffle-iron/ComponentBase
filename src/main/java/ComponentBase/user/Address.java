package ComponentBase.user;


import javax.persistence.Entity;

/**
 * Created by waiti on 5/1/2016.
 */
@Entity
public class Address {
    private String number;
    private String village;
    private String street;
    private String subDistrict;
    private String district;
    private String privince;
    private String postal;

    public Address() {

    }

    public Address(String number, String village, String street, String subDistrict, String district, String privince, String postal) {
        this.number = number;
        this.village = village;
        this.street = street;
        this.subDistrict = subDistrict;
        this.district = district;
        this.privince = privince;
        this.postal = postal;

    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPrivince() {
        return privince;
    }

    public void setPrivince(String privince) {
        this.privince = privince;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

}
