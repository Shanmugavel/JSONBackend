package com.shanmugavel.dummy;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class JSONBackendServlet extends HttpServlet {
	private static final String OPERATION = "operation";

	private static final Logger LOG = Logger.getLogger(JSONBackendServlet.class.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		String operation = StringUtils.trimToEmpty(req.getParameter(OPERATION));
		LOG.info("Operation::" + operation);
		//Hardcode respType to JSON
		resp.setContentType("application/json");
		//Hardcode resp code to 200 -- success response 
		resp.setStatus(200);

		switch (operation) {

		case Constants.OPR_SIGNUP:
			resp.getWriter().println(Constants.RESP_200_OPR_SIGNUP);
			break;
		case Constants.OPR_SIGNIN:
			resp.getWriter().println(Constants.RESP_200_OPR_SIGNIN);

			break;
		case Constants.OPR_CRT_INIT:
			resp.getWriter().println(Constants.RESP_200_OPR_CRT_INIT);

			break;
		case Constants.OPR_UPD_INIT:
			resp.getWriter().println(Constants.RESP_200_OPR_UPD_INIT);

			break;
		case Constants.OPR_FETCH_ALL_INIT:
			resp.getWriter().println(Constants.RESP_200_OPR_FETCH_ALL_INIT);

			break;
		case Constants.OPR_FETCH_INIT:
			resp.getWriter().println(Constants.RESP_200_OPR_FETCH_INIT);

			break;
		case Constants.OPR_CRT_ANNMNT:
			resp.getWriter().println(Constants.RESP_200_OPR_CRT_ANNMNT);

			break;
		case Constants.OPR_FETCH_ALL_USERS:
			resp.getWriter().println(Constants.RESP_200_OPR_FETCH_ALL_USERS);

			break;
		case Constants.OPR_FETCH_ANNMNT:
			resp.getWriter().println(Constants.RESP_200_OPR_FETCH_ANNMNT);
			break;
		case Constants.OPR_FETCH_USER:
			resp.getWriter().println(Constants.RESP_200_OPR_FETCH_USER);

			break;
		default:
			System.out.println("DEFAULT!!!!!!");
			resp.getWriter().println(Constants.RESP_200_OPR_SIGNUP);

		}

	}
}
