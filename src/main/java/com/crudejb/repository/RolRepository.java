/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
package com.crudejb.repository;
import com.avbravo.jmoordb.mongodb.repository.Repository;
import com.crudejb.entity.Rol;
import javax.ejb.Stateless;

/**
 *
 * @author avbravo
 */
@Stateless
public class RolRepository extends Repository<Rol> {

    public RolRepository(){
        super(Rol.class);
    }
   

}
