package com.shanmugavel.dummy;

import java.util.ArrayList;
import java.util.List;

public class Constants {

	public static final String OPR_SIGNUP  = "SignUp";
	public static final String OPR_SIGNIN  = "SignIn";
	public static final String OPR_CRT_INIT  = "CreateInitiative";
	public static final String OPR_UPD_INIT  = "UpdateInitiative";
	public static final String OPR_FETCH_ALL_INIT  = "GetAllInitiative";
	public static final String OPR_FETCH_INIT  = "GetInitiative";
	public static final String OPR_CRT_ANNMNT  = "CreateAnnouncement";
	public static final String OPR_FETCH_ANNMNT  = "GetAnnouncements";
	public static final String OPR_FETCH_ALL_USERS = "GetAllUsers";
	public static final String OPR_FETCH_USER = "GetUser";
	
	public static final String RESP_200_OPR_SIGNUP = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"user\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001}}";
	public static final String RESP_200_OPR_SIGNIN = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"user\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001}}";
	public static final String RESP_200_OPR_CRT_INIT = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"initiative\":{\"id\":101,\"name\":\"Initiative 1\",\"description\":\"Initiative Descripion 1.... blah...blah..\",\"primaryOwner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"secondaryOwner\":{\"firstName\":\"Satish\",\"lastName\":\"Ramamoorthy\",\"email\":\"satish.ramamoorthy@gmail.com\",\"mobileNo\":\"8013171882\",\"id\":1002},\"members\":[{\"firstName\":\"Member\",\"lastName\":\"One\",\"email\":\"member1@gmail.com\",\"password\":\"@bcd1234\",\"mobileNo\":\"1111111111\",\"id\":1003},{\"firstName\":\"Member\",\"lastName\":\"Two\",\"email\":\"member2@gmail.com\",\"password\":\"@bcd4321\",\"mobileNo\":\"1111111112\",\"id\":1004},{\"firstName\":\"Member\",\"lastName\":\"Three\",\"email\":\"member3@gmail.com\",\"password\":\"12cd1234\",\"mobileNo\":\"1111111113\",\"id\":1005}],\"status\":\"A\",\"startDate\":\"Dec 17, 2014 9:02:58 PM\",\"endDate\":\"Dec 15, 2015 9:02:58 PM\"}}";
	public static final String RESP_200_OPR_UPD_INIT = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"initiative\":{\"id\":101,\"name\":\"Initiative 1\",\"description\":\"Initiative Descripion 1......CHANGED.. blah...blah..\",\"primaryOwner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"secondaryOwner\":{\"firstName\":\"Satish\",\"lastName\":\"Ramamoorthy\",\"email\":\"satish.ramamoorthy@gmail.com\",\"mobileNo\":\"8013171882\",\"id\":1002},\"members\":[{\"firstName\":\"Member\",\"lastName\":\"One\",\"email\":\"member1@gmail.com\",\"password\":\"@bcd1234\",\"mobileNo\":\"1111111111\",\"id\":1003},{\"firstName\":\"Member\",\"lastName\":\"Two\",\"email\":\"member2@gmail.com\",\"password\":\"@bcd4321\",\"mobileNo\":\"1111111112\",\"id\":1004},{\"firstName\":\"Member\",\"lastName\":\"Three\",\"email\":\"member3@gmail.com\",\"password\":\"12cd1234\",\"mobileNo\":\"1111111113\",\"id\":1005}],\"status\":\"A\",\"startDate\":\"Dec 17, 2014 9:02:58 PM\",\"endDate\":\"Dec 15, 2015 9:02:58 PM\"}}";
	public static final String RESP_200_OPR_FETCH_ALL_INIT = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"initiatives\":[{\"id\":101,\"name\":\"Initiative 1\",\"description\":\"Initiative Descripion 1.... blah...blah..\",\"primaryOwner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"secondaryOwner\":{\"firstName\":\"Satish\",\"lastName\":\"Ramamoorthy\",\"email\":\"satish.ramamoorthy@gmail.com\",\"mobileNo\":\"8013171882\",\"id\":1002},\"members\":[{\"firstName\":\"Member\",\"lastName\":\"One\",\"email\":\"member1@gmail.com\",\"password\":\"@bcd1234\",\"mobileNo\":\"1111111111\",\"id\":1003},{\"firstName\":\"Member\",\"lastName\":\"Two\",\"email\":\"member2@gmail.com\",\"password\":\"@bcd4321\",\"mobileNo\":\"1111111112\",\"id\":1004},{\"firstName\":\"Member\",\"lastName\":\"Three\",\"email\":\"member3@gmail.com\",\"password\":\"12cd1234\",\"mobileNo\":\"1111111113\",\"id\":1005}],\"status\":\"A\",\"startDate\":\"Dec 17, 2014 9:02:58 PM\",\"endDate\":\"Dec 15, 2015 9:02:58 PM\"},{\"id\":102,\"name\":\"Initiative 2\",\"description\":\"Initiative Descripion 2.... blah...blah..\",\"primaryOwner\":{\"firstName\":\"Satish\",\"lastName\":\"Ramamoorthy\",\"email\":\"satish.ramamoorthy@gmail.com\",\"mobileNo\":\"8013171882\",\"id\":1002},\"secondaryOwner\":{\"firstName\":\"Prem\",\"lastName\":\"Francis\",\"email\":\"prem.francis@gmail.com\",\"mobileNo\":\"8013171282\",\"id\":1003},\"members\":[{\"firstName\":\"Member\",\"lastName\":\"One\",\"email\":\"member1@gmail.com\",\"password\":\"@bcd1234\",\"mobileNo\":\"1111111111\",\"id\":1003},{\"firstName\":\"Member\",\"lastName\":\"Two\",\"email\":\"member2@gmail.com\",\"password\":\"@bcd4321\",\"mobileNo\":\"1111111112\",\"id\":1004},{\"firstName\":\"Member\",\"lastName\":\"Three\",\"email\":\"member3@gmail.com\",\"password\":\"12cd1234\",\"mobileNo\":\"1111111113\",\"id\":1005}],\"status\":\"A\",\"startDate\":\"Dec 17, 2014 9:02:58 PM\",\"endDate\":\"Feb 21, 2015 9:02:58 PM\"}]}";
	public static final String RESP_200_OPR_FETCH_INIT = RESP_200_OPR_CRT_INIT;
	public static final String RESP_200_OPR_CRT_ANNMNT = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"announcement\":{\"id\":1,\"message\":\"Test Anouncement\",\"owner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"createdDt\":\"Jan 15, 2015 9:02:58 PM\"}}";
	public static final String RESP_200_OPR_FETCH_ANNMNT = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"announcements\":[{\"id\":1,\"message\":\"Test Anouncement1\",\"owner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"createdDt\":\"Jan 15, 2015 11:26:30 AM\"},{\"id\":2,\"message\":\"Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......Test Anouncement2......\",\"owner\":{\"firstName\":\"Satish\",\"lastName\":\"Ramamoorthy\",\"email\":\"satish.ramamoorthy@gmail.com\",\"mobileNo\":\"8013171882\",\"id\":1002},\"createdDt\":\"Jan 14, 2015 11:26:30 AM\"},{\"id\":3,\"message\":\"Test Anouncement3\",\"owner\":{\"firstName\":\"Prem\",\"lastName\":\"Francis\",\"email\":\"prem.francis@gmail.com\",\"mobileNo\":\"8013171282\",\"id\":1003},\"createdDt\":\"Jan 13, 2015 11:26:30 AM\"},{\"id\":4,\"message\":\"Test Anouncement4\",\"owner\":{\"firstName\":\"Shanmugavel\",\"lastName\":\"Sundaramoorthy\",\"email\":\"shanmugavel.rs@gmail.com\",\"mobileNo\":\"8014418636\",\"id\":1001},\"createdDt\":\"Dec 12, 2014 11:26:30 AM\"}]}";
	public static final String RESP_200_OPR_FETCH_ALL_USERS = "{\"response\":{\"responseCd\":\"000\",\"responseMsg\":\"Success\"},\"users\":[{\"firstName\":\"Member\",\"lastName\":\"One\",\"email\":\"member1@gmail.com\",\"password\":\"@bcd1234\",\"mobileNo\":\"1111111111\",\"id\":1003},{\"firstName\":\"Member\",\"lastName\":\"Two\",\"email\":\"member2@gmail.com\",\"password\":\"@bcd4321\",\"mobileNo\":\"1111111112\",\"id\":1004},{\"firstName\":\"Member\",\"lastName\":\"Three\",\"email\":\"member3@gmail.com\",\"password\":\"12cd1234\",\"mobileNo\":\"1111111113\",\"id\":1005}]}";
	public static final String RESP_200_OPR_FETCH_USER = RESP_200_OPR_SIGNIN;

	public static final List<String> FLOWS = new ArrayList<String>();

	static {
		FLOWS.add(Constants.OPR_SIGNUP);
		FLOWS.add(Constants.OPR_SIGNIN);
		FLOWS.add(Constants.OPR_CRT_INIT);
		FLOWS.add(Constants.OPR_UPD_INIT);
		FLOWS.add(Constants.OPR_FETCH_ALL_INIT);
		FLOWS.add(Constants.OPR_FETCH_INIT);
		FLOWS.add(Constants.OPR_CRT_ANNMNT);
		FLOWS.add(Constants.OPR_FETCH_ALL_USERS);
		FLOWS.add(Constants.OPR_FETCH_USER);
		FLOWS.add(Constants.OPR_FETCH_ANNMNT);
	}
}
