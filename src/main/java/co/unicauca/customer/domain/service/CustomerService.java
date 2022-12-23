/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.customer.domain.service;

import co.unicauca.customer.access.ICustomerRepository;
import co.unicauca.customer.domain.entity.Customer;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

/**
 *
 * @author ASUS
 */
@RequestScoped
public class CustomerService {
    
    @Inject
    @Default
    ICustomerRepository repo;
    
    public CustomerService(){
        
    }
    public Customer findById(int id) {
        return repo.findById(id);
    }

    public boolean create(Customer cust) {
        return repo.create(cust);
    }
}
