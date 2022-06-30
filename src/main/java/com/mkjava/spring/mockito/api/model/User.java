package com.mkjava.spring.mockito.api.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name= "users")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name", nullable=false)
	
	//user name should not be null or empty
	// user name should have atleast 2 characters
	
	@NotEmpty
	@Size(min= 2, message = "user name should have at least 2 characters")
	private String name;
	
	// email should not be empty or null
	// email should be a valid email format
	
	@NotNull
	@Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
	private int age;
	
	// password should not be empty or null
	// password should have atleast 8 characters
	
	@NotEmpty
	@Size(min = 1, max = 200, message= "Address must be between 1 and 200 characters")
	private String address;
	
	public User() {
		
	}
	
	public User(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	
	
	
	
	
	
}

