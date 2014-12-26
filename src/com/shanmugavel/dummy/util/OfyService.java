package com.shanmugavel.dummy.util;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.shanmugavel.dummy.pojo.Announcement;
import com.shanmugavel.dummy.pojo.Initiative;
import com.shanmugavel.dummy.pojo.User;

public class OfyService {

	static {
		factory().register(User.class);	
		factory().register(Announcement.class);	
		factory().register(Initiative.class);	
	}
	
	public static Objectify ofy() {
		return ObjectifyService.ofy();
	}
	
	public static ObjectifyFactory factory() {
			return ObjectifyService.factory();
	}
}
