/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;

/**
 *
 * @author Khien
 */
public class Person {
    private String firstname;
	private String lastname;
	private String address;
	private String fullname;
	
	public Person(String firstname, String lastname, String address) {
		
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}


   String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

  
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

 
    public String getAddress() {
        return address;
    }

 
    public void setAddress(String address) {
        this.address = address;
    }

 
    public String getFullname() {
    return fullname = this.firstname + ", " + this.lastname + ", " + this.address;
    }


}