/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.ejb.Local;
import labo3.Coffee;

/**
 *
 * @author Anton
 */
@Local
public interface CoffeeFacadeLocal {

    void create(Coffee coffee);

    void edit(Coffee coffee);

    void remove(Coffee coffee);

    Coffee find(Object id);

    List<Coffee> findAll();

    List<Coffee> findRange(int[] range);

    int count();
    
}
