/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import Facades.CoffeeFacadeLocal;
import Facades.TeaFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import labo3.Coffee;
import labo3.Tea;

/**
 *
 * @author Anton
 */
@Stateless
public class ProductManager implements ProductManagerRemote {

    @EJB
    private TeaFacadeLocal teaFacade;

    @EJB
    private CoffeeFacadeLocal coffeeFacade;

    
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void createCoffee(String name, String description, double pricePerKilo, int type, String country, int strength, boolean isCaffeinated ) 
    {
        Coffee coffee = new Coffee(name,description, pricePerKilo,type, country, strength,isCaffeinated);
        coffeeFacade.create(coffee);
    }

    @Override
    public void createTea(String name, String description, double pricePerKilo, String country, String teaType) {
        Tea tea = new Tea(name,description,pricePerKilo,country,teaType);
        teaFacade.create(tea);
    }
    
    
    
}
