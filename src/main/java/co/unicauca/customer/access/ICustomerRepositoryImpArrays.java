/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.customer.access;

import co.unicauca.customer.domain.entity.Customer;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.inject.Default;

/**
 *
 * @author ASUS
 */
@Default
public class ICustomerRepositoryImpArrays implements ICustomerRepository{
    
    public static List<Customer> customers;
    
    public ICustomerRepositoryImpArrays() {
        if (customers == null) {
            customers = new ArrayList<>();
            initialize();
        }
    }

    private void initialize() {
        customers.add(new Customer(98000001, "Andrea", "Sanchez", "Calle 14 No 11-12 Popayan", "3145878752", "andrea@hotmail.com", "Femenino"));
        customers.add(new Customer(98000002, "Libardo", "Pantoja", "Santa Barbar Popayan", "3141257845", "libardo@gmail.com", "Masculino"));
        customers.add(new Customer(98000003, "Carlos", "Pantoja", "Santa Barbar Popayan", "3141257846", "carlos@gmail.com", "Masculino"));
        customers.add(new Customer(98000004, "Fernanda", "Arevalo", "Calle 16 No 12-12 Popayan", "3154562133", "fercha@hotmail.com", "Femenino"));
        customers.add(new Customer(98000005, "Manuel", "Perez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000006, "Alejandro", "Mosquera", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000007, "Cesar", "Gutierres Sanchez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000008, "Julio", "Bravo Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000009, "Alberto", "Mendez Bravo", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000010, "Alexander", "Ponce Yepes", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));
        customers.add(new Customer(98000011, "Federika", "Pantoja Yepez", "Calle 12 No 12-12 Popayan", "3154575845", "fer@hotmail.com", "Masculino"));

    }

    @Override
    public Customer findById(Integer id) {
        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public boolean create(Customer customer) {
         Customer cust = this.findById(customer.getId());
        if (cust != null) {
            //Ya existe
            return false;
        }
        customers.add(customer);
        return true;
    }
    
}
