package com.chen.li.pojo;

public class NextTestBean {
	private int id;
	private String name;
	private int age;
	private String phoneNumber;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "NextTestBean [name=" + name + ", age=" + age + ", phoneNumber=" + phoneNumber + "]";
	}

}
