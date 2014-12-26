package com.shanmugavel.dummy.pojo;

import java.util.List;

public class ResponseAnnouncements {
	private Response response;
	private List<Announcement> announcements;
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public List<Announcement> getAnnouncements() {
		return announcements;
	}
	public void setAnnouncements(List<Announcement> announcements) {
		this.announcements = announcements;
	}
	
	
}
