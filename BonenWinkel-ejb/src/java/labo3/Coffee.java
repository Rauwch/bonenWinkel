/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo3;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Anton
 */
@Entity
public class Coffee extends Product implements Serializable   {

    private CoffeeType coffeeType;
    private boolean isCaffienated;
    private int strength;
    @ManyToMany
    private List<Farmer> grownByFarmers;

    public Coffee() {
    }
    
    public Coffee(String name, String description, double pricePerKilo, int type, String country, int strength, boolean isCaffeinated ) {
        this.coffeeType = CoffeeType.values()[type];
        this.isCaffienated = isCaffienated;
        this.strength = strength;
        setCountry(country);
        setDescription(description);
        setName(name);
        setPricePerKilo(pricePerKilo);
    }
    
    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public boolean isIsCaffienated() {
        return isCaffienated;
    }

    public void setIsCaffienated(boolean isCaffienated) {
        this.isCaffienated = isCaffienated;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<Farmer> getGrownByFarmers() {
        return grownByFarmers;
    }

    public void setGrownByFarmers(List<Farmer> grownByFarmers) {
        this.grownByFarmers = grownByFarmers;
    }
    

}
