/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo2;
import entities.Item;
import entities.ItemDO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 *
 * @author Anton
 */
@Stateful
public class ShoppingCart implements ShoppingCartRemote {
    
    private List<Item> cartItems = new ArrayList<>();
    
    @Override
    public void addItem(ItemDO itemdo) 
    {  
        Item item = new Item(itemdo.getName(),itemdo.getPrice(),itemdo.getDescription());
        if(!cartItems.contains(item))
            cartItems.add(item);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
