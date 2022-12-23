/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.customer.presentation.rest;

import co.unicauca.customer.domain.entity.Customer;
import co.unicauca.customer.domain.service.CustomerService;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ASUS
 */
@Stateless
@Path("customers")
public class CustomerController {
    
    @Inject
    private CustomerService service;

    public CustomerController() {
    }
    
    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Customer findById(@PathParam("id") int id){
        return service.findById(id);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String create(Customer cust) {
        if (service.create(cust)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Customer creado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el Customer\",\"errores\":\"Id ya existe\"}";
        }
    }
}
