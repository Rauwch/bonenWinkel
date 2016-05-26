/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo2;

import entities.Item;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Anton
 */
@Stateless
public class StockManager implements StockManagerRemote {

    @PersistenceContext(unitName = "BonenWinkel-ejbPU")
    private EntityManager em;
    
    @Override
    public void addItem(String name, double price, String description){
        Item item = new Item(name,price,description);
        persist(item);     
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public void sales() {
        
    }
    
    
}
