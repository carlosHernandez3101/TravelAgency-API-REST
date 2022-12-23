/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.unicauca.customer.access;

import co.unicauca.customer.domain.entity.Customer;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface ICustomerRepository {

    Customer findById(Integer id);

    boolean create(Customer newCustomer);    
}
