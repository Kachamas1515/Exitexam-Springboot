package com.exitexam.MVC;

public class hospitals_Model {
	
	private Integer hid;
	private String title;
	
	public hospitals_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hospitals_Model(Integer hid, String title) {
		super();
		this.hid = hid;
		this.title = title;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
