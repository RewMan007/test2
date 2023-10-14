/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Products;

/**
 *
 * @author ratchaphum
 */
public class ProductTable {

    
    public static List<Products> findAllProduct(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("OnlineShopPU");
        EntityManager em = emf.createEntityManager();
        //เชื่อม db
    
        List<Products> prolist = null;
        try{
            prolist = (List<Products>) em.createNamedQuery("Products.findAll").getResultList();
            
        } catch (Exception ex){
            throw new RuntimeException(ex);
          
        } finally {
            em.close();
            emf.close();
        }
       
                
                
        return prolist;
    }
    
    

}
