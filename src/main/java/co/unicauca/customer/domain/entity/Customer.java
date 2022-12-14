/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.customer.domain.entity;

/**
 *
 * @author ASUS
 */
public class Customer {
    
    /**
     * Cedula
     */
    private Integer id;
    /**
     * Nombres
     */
    private String firstName;
    /**
     * Apellidos
     */
    private String lastName;
    /**
     * Dirección de residencia
     */
    private String address;
    /**
     * Teléfono Móvil
     */
    private String mobile;
    /**
     * Email
     */
    private String email;
    /**
     * Sexo
     */
    private String gender;

    /**
     * Constructor parametrizado
     *
     * @param id cedula
     * @param firstName nombres
     * @param lastName apellidos
     * @param address dirección
     * @param mobile celular
     * @param email email
     * @param gender sexo
     */
    public Customer(Integer id, String firstName, String lastName, String address, String mobile, String email, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
    }

    /**
     * Constructor por defecto
     */
    public Customer() {

    }

    

    public Integer getId() {
        return id;
    }

    /**
     * Getters and Setters
     *
     * @return
     */
    public void setId(Integer id) {    
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", mobile=" + mobile + ", email=" + email + ", gender=" + gender + '}';
    }    
    
}
