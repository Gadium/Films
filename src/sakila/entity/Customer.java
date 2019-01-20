package sakila.entity;
// Generated 19-ene-2019 18:42:57 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Short customerId;
     private Address address;
     private Store store;
     private String firstName;
     private String lastName;
     private String email;
     private boolean active;
     private Date createDate;
     private Date lastUpdate;

    public Customer() {
    }

	
    public Customer(Address address, Store store, String firstName, String lastName, boolean active, Date createDate, Date lastUpdate) {
        this.address = address;
        this.store = store;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }
    public Customer(Address address, Store store, String firstName, String lastName, String email, boolean active, Date createDate, Date lastUpdate) {
       this.address = address;
       this.store = store;
       this.firstName = firstName;
       this.lastName = lastName;
       this.email = email;
       this.active = active;
       this.createDate = createDate;
       this.lastUpdate = lastUpdate;
    }
   
    public Short getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }
    public Address getAddress() {
        return this.address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}


