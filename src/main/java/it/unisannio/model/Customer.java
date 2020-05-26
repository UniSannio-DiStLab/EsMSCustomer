package it.unisannio.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
public class Customer implements Serializable {
 
	@Id
	private String CF;
	private String firstName;
	private String lastName;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	public Customer(String cf, String fn, String ln) {
		lastName = ln;
		firstName = fn;
		CF = cf;
	}
	public String getCF() {
		return this.CF;
	}

	public void setCF(String CF) {
		this.CF = CF;
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
}
