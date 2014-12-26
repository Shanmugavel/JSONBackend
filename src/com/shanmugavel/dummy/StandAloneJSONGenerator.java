package com.shanmugavel.dummy;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shanmugavel.dummy.pojo.Announcement;
import com.shanmugavel.dummy.pojo.Initiative;
import com.shanmugavel.dummy.pojo.Response;
import com.shanmugavel.dummy.pojo.ResponseAnnouncement;
import com.shanmugavel.dummy.pojo.ResponseAnnouncements;
import com.shanmugavel.dummy.pojo.ResponseInitiative;
import com.shanmugavel.dummy.pojo.ResponseInitiatives;
import com.shanmugavel.dummy.pojo.ResponseUser;
import com.shanmugavel.dummy.pojo.ResponseUsers;
import com.shanmugavel.dummy.pojo.User;

public class StandAloneJSONGenerator {

	public static void main(String[] args) {

		Gson gson = new GsonBuilder().create();
		
		//System.out.println(StringEscapeUtils.escapeJava(gson.toJson(simulateSignup())));

		//System.out.println(StringEscapeUtils.escapeJava(gson.toJson(simulateSignin())));
		
		//System.out.println(StringEscapeUtils.escapeJava(gson.toJson(similateCreateAnnouncement())));
		
		//System.out.println(StringEscapeUtils.escapeJava(gson.toJson(similateFetchAnnouncements())));

		Response successResp = new Response();
		successResp.setResponseCd("000");
		successResp.setResponseMsg("Success");
		
		ResponseUser signUp = new ResponseUser();
		signUp.setResponse(successResp);
		signUp.setUser(simulateSignup());
		System.out.println("signUp");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(signUp)));
		
		ResponseUser signIn = new ResponseUser();
		signIn.setResponse(successResp);
		signIn.setUser(simulateSignup());
		System.out.println("signIn");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(signIn)));
		
		ResponseInitiative crtInitiative = new ResponseInitiative();
		crtInitiative.setResponse(successResp);
		crtInitiative.setInitiative(simulatecreateInitiative());
		System.out.println("crtInitiative");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(crtInitiative)));
		
		ResponseInitiative updInitiative = new ResponseInitiative();
		updInitiative.setResponse(successResp);
		updInitiative.setInitiative(simulateUpdateInitiative());
		System.out.println("updInitiative");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(updInitiative)));
		
		ResponseInitiatives fetchAllInit = new ResponseInitiatives();
		fetchAllInit.setInitiatives(simulateFetchInitiative());
		fetchAllInit.setResponse(successResp);
		System.out.println("fetchAllInit");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(fetchAllInit)));
		
		ResponseUsers fetchUsers = new ResponseUsers();
		fetchUsers.setResponse(successResp);
		fetchUsers.setUsers(simulateFetchUsers());
		System.out.println("fetchUsers");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(fetchUsers)));
		
		ResponseAnnouncement crtAnnmnt = new ResponseAnnouncement();
		crtAnnmnt.setAnnouncement(similateCreateAnnouncement());
		crtAnnmnt.setResponse(successResp);
		System.out.println("crtAnnmnt");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(crtAnnmnt)));
		
		ResponseAnnouncements fetchAnnmnts = new ResponseAnnouncements();
		fetchAnnmnts.setAnnouncements(similateFetchAnnouncements());
		fetchAnnmnts.setResponse(successResp);
		System.out.println("fetchAnnmnts");
		System.out.println(StringEscapeUtils.escapeJava(gson.toJson(fetchAnnmnts)));

}


		private static User simulateSignup() {
			User user = new User();
			user.setEmail("shanmugavel.rs@gmail.com");
			user.setFirstName("Shanmugavel");
			user.setLastName("Sundaramoorthy");
			user.setMobileNo("8014418636");
			//user.setPassword("t3st1234");
			user.setId(1001L);
			return user;
		}
		
		private static User simulateSignupSecondary() {
			User user = new User();
			user.setEmail("satish.ramamoorthy@gmail.com");
			user.setFirstName("Satish");
			user.setLastName("Ramamoorthy");
			user.setMobileNo("8013171882");
			//user.setPassword("@bcd1234");
			user.setId(1002L);
			return user;
		}
		
		private static User simulateSignupTrinary() {
			User user = new User();
			user.setEmail("prem.francis@gmail.com");
			user.setFirstName("Prem");
			user.setLastName("Francis");
			user.setMobileNo("8013171282");
			//user.setPassword("test@bcd");
			user.setId(1003L);
			return user;
		}
		
		private static List<User> simulateFetchUsers() {
			List<User> lst = new ArrayList<User>();
			
			User user = new User();
			user.setEmail("member1@gmail.com");
			user.setFirstName("Member");
			user.setLastName("One");
			user.setMobileNo("1111111111");
			user.setPassword("@bcd1234");
			user.setId(1003L);
			lst.add(user);
			
			User user1 = new User();
			user1.setEmail("member2@gmail.com");
			user1.setFirstName("Member");
			user1.setLastName("Two");
			user1.setMobileNo("1111111112");
			user1.setPassword("@bcd4321");
			user1.setId(1004L);
			lst.add(user1);
			
			User user2 = new User();
			user2.setEmail("member3@gmail.com");
			user2.setFirstName("Member");
			user2.setLastName("Three");
			user2.setMobileNo("1111111113");
			user2.setPassword("12cd1234");
			user2.setId(1005L);
			lst.add(user2);
			
			return lst;
		}
		
		private static User simulateSignin() {
			User user = new User();
			user.setEmail("shanmugavel.rs@gmail.com");
			user.setPassword("t3st1234");
			return user;
		}
		
		private static Announcement similateCreateAnnouncement() {
			Calendar cal = Calendar.getInstance();
			cal.set(2014, 12, 15);
			Date endDate = cal.getTime();
			
			Announcement  ann = new Announcement();
			ann.setId(1L);
			ann.setMessage("Test Anouncement");
			ann.setCreatedDt(endDate);
			ann.setOwner(simulateSignup());
			return ann;
		}
		
		private static List<Announcement> similateFetchAnnouncements() {
			List<Announcement> lst = new ArrayList<Announcement>();
			
			Calendar cal = Calendar.getInstance();
			cal.set(2014, 12, 15);
			Date endDate = cal.getTime();
			Announcement  ann1 = new Announcement();
			ann1.setId(1L);
			ann1.setMessage("Test Anouncement1");
			ann1.setOwner(simulateSignup());
			ann1.setCreatedDt(endDate);
			lst.add(ann1);
			
			Calendar cal2 = Calendar.getInstance();
			cal2.set(2014, 12, 14);
			Date endDate2 = cal2.getTime();
			Announcement  ann2 = new Announcement();
			ann2.setId(2L);
			ann2.setMessage("Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......");
			ann2.setOwner(simulateSignupSecondary());
			ann2.setCreatedDt(endDate2);
			lst.add(ann2);
			
			Calendar cal3 = Calendar.getInstance();
			cal3.set(2014, 12, 13);
			Date endDate3 = cal3.getTime();
			Announcement  ann3 = new Announcement();
			ann3.setId(3L);
			ann3.setMessage("Test Anouncement3");
			ann3.setOwner(simulateSignupTrinary());
			ann3.setCreatedDt(endDate3);
			lst.add(ann3);	
			
			Calendar cal4 = Calendar.getInstance();
			cal4.set(2014, 11, 12);
			Date endDate4 = cal4.getTime();
			Announcement  ann4 = new Announcement();
			ann4.setId(4L);
			ann4.setMessage("Test Anouncement4");
			ann4.setOwner(simulateSignup());
			ann4.setCreatedDt(endDate4);
			lst.add(ann4);	
			return lst;
		}
		
		private static Initiative simulatecreateInitiative() {
			Calendar cal = Calendar.getInstance();
			cal.set(2015, 11, 15);
			Date endDate = cal.getTime();
			Initiative init = new Initiative();
			init.setDescription("Initiative Descripion 1.... blah...blah..");
			init.setEndDate(endDate);
			init.setId(101L);
			init.setMembers(simulateFetchUsers());
			init.setName("Initiative 1");
			init.setPrimaryOwner(simulateSignup());
			init.setSecondaryOwner(simulateSignupSecondary());
			init.setStartDate(Calendar.getInstance().getTime());
			init.setStatus("A");
			return init;
		}
		
		private static Initiative simulateUpdateInitiative() {
			Calendar cal = Calendar.getInstance();
			cal.set(2015, 11, 15);
			Date endDate = cal.getTime();
			Initiative init = new Initiative();
			init.setDescription("Initiative Descripion 1......CHANGED.. blah...blah..");
			init.setEndDate(endDate);
			init.setId(101L);
			init.setMembers(simulateFetchUsers());
			init.setName("Initiative 1");
			init.setPrimaryOwner(simulateSignup());
			init.setSecondaryOwner(simulateSignupSecondary());
			init.setStartDate(Calendar.getInstance().getTime());
			init.setStatus("A");
			return init;
		}
		
		private static Initiative simulatecreateInitiativeTwo() {
			Calendar cal = Calendar.getInstance();
			cal.set(2015, 01, 21);
			Date endDate = cal.getTime();
			Initiative init = new Initiative();
			init.setDescription("Initiative Descripion 2.... blah...blah..");
			init.setEndDate(endDate);
			init.setId(102L);
			init.setMembers(simulateFetchUsers());
			init.setName("Initiative 2");
			init.setPrimaryOwner(simulateSignupSecondary());
			init.setSecondaryOwner(simulateSignupTrinary());
			init.setStartDate(Calendar.getInstance().getTime());
			init.setStatus("A");
			return init;
		}
		
		private static List<Initiative> simulateFetchInitiative() {
			List<Initiative> lst = new ArrayList<Initiative>();
			
			lst.add(simulatecreateInitiative());
			lst.add(simulatecreateInitiativeTwo());

			return lst;
		}
		
}
