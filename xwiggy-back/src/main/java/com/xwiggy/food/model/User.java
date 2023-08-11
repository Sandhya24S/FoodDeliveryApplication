package com.xwiggy.food.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 100)
    private int id;
    @Column(length = 100)
    private String username;
    @Column(length = 100)
    private String password;
    @Column(length = 100)
    private String firstname;
    @Column(length = 100)
    private String lastname;
    @Column(length = 100)
    private String email;
    @Column(length = 100)
    private String address;
    private long phone;
    @Column(length = 100)
    private boolean merchant;

    public User() {

    }

    public User(String username, String password, String firstname, String lastname, String email, String address, long phone,
                boolean merchant) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.merchant=merchant;
    }
    

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMerchant() {
        return merchant;
    }

    public void setMerchant(boolean merchant) {
        this.merchant = merchant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        System.out.println("username: " + username);
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        System.out.println("firstname: " + firstname);
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        System.out.println("lastname: " + lastname);
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    
    
    public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone
				+ ", merchant=" + merchant + "]";
	}

	


	
}
