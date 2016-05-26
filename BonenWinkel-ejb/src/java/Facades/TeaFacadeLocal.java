/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.ejb.Local;
import labo3.Tea;

/**
 *
 * @author Anton
 */
@Local
public interface TeaFacadeLocal {

    void create(Tea tea);

    void edit(Tea tea);

    void remove(Tea tea);

    Tea find(Object id);

    List<Tea> findAll();

    List<Tea> findRange(int[] range);

    int count();
    
}
