package com.exitexam.MVC;

public class patient_covid_status_Model {
	
	private Integer hnid;
	private String status;
	public patient_covid_status_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public patient_covid_status_Model(Integer hnid, String status) {
		super();
		this.hnid = hnid;
		this.status = status;
	}
	public Integer getHnid() {
		return hnid;
	}
	public void setHnid(Integer hnid) {
		this.hnid = hnid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
