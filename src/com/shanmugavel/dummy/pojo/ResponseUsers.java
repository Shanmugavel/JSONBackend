package com.shanmugavel.dummy.pojo;

import java.util.List;

public class ResponseUsers {
	private Response response;
	private List<User> users;
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
}
