package com.zkr.Pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8850122855628729990L;
	private Integer id;
	private String name;
	private Date birthday;
	private String address;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Integer id, String name, Date birthday, String address) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthday=" + birthday + ", address=" + address + "]";
	}
	
}
