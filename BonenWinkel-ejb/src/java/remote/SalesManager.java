/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remote;

import Facades.FarmerFacadeLocal;
import Facades.ResellerFacadeLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import labo3.Address;
import labo3.Farmer;
import labo3.Reseller;

/**
 *
 * @author Anton
 */
@Stateless
public class SalesManager implements SalesManagerRemote {

    @EJB
    private ResellerFacadeLocal resellerFacade;

    @EJB
    private FarmerFacadeLocal farmerFacade;

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void createReseller(String name, String email, String street,String city, int nr, String country, int cellphone) 
    {
        Address address = new Address(street,city, country, nr);
        Reseller reseller = new Reseller(name,email,address, cellphone);
        resellerFacade.create(reseller);    
    }

    @Override
    public void createFarmer(String name, String email, String street,String city, int nr, String country ) 
    { 
         Address address = new Address(street,city, country, nr);
         Farmer farmer = new Farmer(name,email,address);
         farmerFacade.create(farmer);
    }
    
    
    
    
}
