/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import labo3.Reseller;

/**
 *
 * @author Anton
 */
@Stateless
public class ResellerFacade extends AbstractFacade<Reseller> implements ResellerFacadeLocal {

    @PersistenceContext(unitName = "BonenWinkel-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResellerFacade() {
        super(Reseller.class);
    }
    
}
