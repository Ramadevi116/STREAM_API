package cus;

import java.time.LocalDate;
import java.util.Date;

public class CustomerDetails {
	String id;
	  String name;		
	  String address;
	  String city;
	  String state;	
	  long pincode;		 
	  String emailid;
	  float balance;		 
	  long acctnumber;	 
	  long mobnum;		 
	  String gender;
	  String title;
	  String remarks;		  
	  String profession;
	  LocalDate dob;
	  
	  
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", state="
				+ state + ", pincode=" + pincode + ", emailid=" + emailid + ", balance=" + balance + ", acctnumber="
				+ acctnumber + ", mobnum=" + mobnum + ", gender=" + gender + ", title=" + title + ", remarks=" + remarks
				+ ", profession=" + profession + ", dob=" + dob + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public long getAcctnumber() {
		return acctnumber;
	}
	public void setAcctnumber(long acctnumber) {
		this.acctnumber = acctnumber;
	}
	public long getMobnum() {
		return mobnum;
	}
	public void setMobnum(long mobnum) {
		this.mobnum = mobnum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getremarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	  
	  
	
	
	
	
}
