/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;
import java.io.Serializable;
import javax.persistence.Embeddable;


/**
 *
 * @author Anton
 */
@Embeddable
public class Address implements Serializable{

    private String street;
    private String city;
    private String country;
    private int nr;

    public Address() {
    }

    public Address( String street, String city, String country, int nr) {

        this.street = street;
        this.city = city;
        this.country = country;
        this.nr = nr;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

}
