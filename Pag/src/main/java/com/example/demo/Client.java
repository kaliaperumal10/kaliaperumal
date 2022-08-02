package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;
@Entity
public class Client {
	@Id
	private int Cid;
	
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	@Size(min=5, max=10)
	private String name;
private String pass1,pass2,address,city,img;


private int age,flag;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass1() {
	return pass1;
}
public void setPass1(String pass1) {
	this.pass1 = pass1;
}
public String getPass2() {
	return pass2;
}
public void setPass2(String pass2) {
	this.pass2 = pass2;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public long getMno() {
	return mno;
}
public void setMno(long mno) {
	this.mno = mno;
}
private long mno;

}








