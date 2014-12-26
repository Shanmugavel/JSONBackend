package com.shanmugavel.dummy.pojo;

import java.util.Date;
import java.util.List;

import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiResourceProperty;
import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.Parent;

@Entity
public class Initiative {

	@Id
	private Long id;
	private String name;
	private String description;
	@Load @Parent private Ref<User> primaryOwner;
	@Load private Ref<User> secondaryOwner;
	@Load private Ref<List<User>> members;
	private String status;
	private Date startDate;
	private Date endDate;
	
	public Initiative() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public User getPrimaryOwner() {
		return primaryOwner.get();
	}

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public void setPrimaryOwner(User primaryOwner) {
		this.primaryOwner = Ref.create(primaryOwner);
	}
	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public User getSecondaryOwner() {
		return secondaryOwner.get();
	}

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public void setSecondaryOwner(User secondaryOwner) {
		this.secondaryOwner = Ref.create(secondaryOwner);
	}
	
	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public List<User> getMembers() {
		return members.get();
	}

	@ApiResourceProperty(ignored = AnnotationBoolean.TRUE)
	public void setMembers(List<User> members) {
		this.members = Ref.create(members);
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
