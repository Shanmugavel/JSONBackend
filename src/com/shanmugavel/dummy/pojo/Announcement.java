package com.shanmugavel.dummy.pojo;

import java.util.Date;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Announcement {

	@Id
	@Index private Long id;
	private String message;
	@Load @Parent  private Ref<User> owner;
	private Date createdDt;
	
	public Announcement() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public User getOwner() {
		return owner.get();
	}

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public void setOwner(User owner) {
		this.owner = Ref.create(owner);
	}

	public Date getCreatedDt() {
		return createdDt;
	}
	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
