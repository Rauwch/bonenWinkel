/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.ejb.Local;
import labo3.Reseller;

/**
 *
 * @author Anton
 */
@Local
public interface ResellerFacadeLocal {

    void create(Reseller reseller);

    void edit(Reseller reseller);

    void remove(Reseller reseller);

    Reseller find(Object id);

    List<Reseller> findAll();

    List<Reseller> findRange(int[] range);

    int count();
    
}
