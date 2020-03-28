package com.exitexam.MVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
		/// get status ///
		@CrossOrigin(origins = "*", allowedHeaders = "*")
		@RequestMapping(value = "/status",method = RequestMethod.GET)
		   public ResponseEntity<Object> getStatus() {
			ArrayList<patient_covid_status_Model> list = new ArrayList<>();
			ResultSet rs = null;
			PreparedStatement pst = null; //query
			Connection conn = null;  //DB

			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "p@ssw0rd");
				pst = conn.prepareStatement("SELECT * FROM exitexam.patient_covid_status;");
				rs = pst.executeQuery();
				
				while (rs.next()) {
					patient_covid_status_Model status = new patient_covid_status_Model();
					status.setHnid(rs.getInt("hnid"));
					status.setStatus(rs.getString("status"));
					list.add(status);
					System.out.println(pst);
					System.out.println(list);
				}

			} catch (Exception e) {
				System.out.println("error ");
				e.printStackTrace();
			}			
		      return new ResponseEntity<>(list, HttpStatus.OK);
		   }
		
		
				/// get patirnts ///
				@CrossOrigin(origins = "*", allowedHeaders = "*")
				@RequestMapping(value = "/patirnts",method = RequestMethod.GET)
				   public ResponseEntity<Object> getPatirnts() {
					ArrayList<patirnts_Model> ptList = new ArrayList<>();
					ResultSet rs = null;
					PreparedStatement pst = null; //query
					Connection conn = null;  //DB

					try {
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "p@ssw0rd");
						pst = conn.prepareStatement("SELECT * FROM exitexam.patients;");
						rs = pst.executeQuery();
						
						while (rs.next()) {
							patirnts_Model pt = new patirnts_Model();
							pt.setHnid_pt(rs.getInt("hnid"));
							pt.setFirstname(rs.getString("firstname"));
							pt.setLastname(rs.getString("lastname"));
							pt.setHid_pt(rs.getInt("hid"));

							ptList.add(pt);
							System.out.println(pst);
							System.out.println(ptList);
						}

					} catch (Exception e) {
						System.out.println("error ");
						e.printStackTrace();
					}			
				      return new ResponseEntity<>(ptList, HttpStatus.OK);
				   }
				
				/// get hospitals ///
				@CrossOrigin(origins = "*", allowedHeaders = "*")
				@RequestMapping(value = "/hospitals",method = RequestMethod.GET)
				   public ResponseEntity<Object> getHospitals() {
					
					ArrayList<hospitals_Model> hosList = new ArrayList<>();
					ResultSet rs = null;
					PreparedStatement pst = null; //query
					Connection conn = null;  //DB

					try {
						conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "p@ssw0rd");
						pst = conn.prepareStatement("SELECT * FROM exitexam.hospitals;");
						rs = pst.executeQuery();
						
						while (rs.next()) {
							hospitals_Model hos = new hospitals_Model();
							hos.setHid(rs.getInt("hid"));
							hos.setTitle(rs.getString("title"));

							hosList.add(hos);
							System.out.println(pst);
							System.out.println(hosList);
						}

					} catch (Exception e) {
						System.out.println("error ");
						e.printStackTrace();
					}			
				      return new ResponseEntity<>(hosList, HttpStatus.OK);
				   }

}
