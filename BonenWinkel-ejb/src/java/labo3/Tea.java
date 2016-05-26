/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Anton
 */
@Entity
public class Tea extends Product implements Serializable {
    private String teaType;

    public Tea() {
    }

    public Tea(String name, String description, double pricePerKilo, String country, String teaType) {
        this.teaType = teaType;
        setCountry(country);
        setDescription(description);
        setName(name);
        setPricePerKilo(pricePerKilo);
    }
    
    
    
    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }


    
}
