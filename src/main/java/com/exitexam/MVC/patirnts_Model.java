package com.exitexam.MVC;

public class patirnts_Model {
	
	private Integer hnid_pt;
	private String firstname;
	private String lastname;
	private Integer hid_pt;
	
	public patirnts_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public patirnts_Model(Integer hnid, String firstname, String lastname, Integer hid) {
		super();
		this.hnid_pt = hnid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.hid_pt = hid;
	}
	
	public Integer getHnid_pt() {
		return hnid_pt;
	}
	public void setHnid_pt(Integer hnid_pt) {
		this.hnid_pt = hnid_pt;
	}
	public String getFirstname() {
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
	public Integer getHid_pt() {
		return hid_pt;
	}
	public void setHid_pt(Integer hid_pt) {
		this.hid_pt = hid_pt;
	}
	
	
	
	

}
