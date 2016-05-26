/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.ejb.Local;
import labo3.Farmer;

/**
 *
 * @author Anton
 */
@Local
public interface FarmerFacadeLocal {

    void create(Farmer farmer);

    void edit(Farmer farmer);

    void remove(Farmer farmer);

    Farmer find(Object id);

    List<Farmer> findAll();

    List<Farmer> findRange(int[] range);

    int count();
    
}
