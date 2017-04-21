package com.customer.rac.tcreview;

import javax.jws.WebParam;

@javax.jws.WebService(targetNamespace = "http://tcreview.rac.customer.com/", serviceName = "TC_ReviewService", portName = "TC_ReviewPort")

public class TC_ReviewDelegate {

	com.customer.rac.tcreview.TC_Review tC_Review = new com.customer.rac.tcreview.TC_Review();

	public String setWorkflowDecision(@WebParam(name = "str_workflowuid") String str_workflowuid,
			@WebParam(name = "str_decision") String str_decision, @WebParam(name = "str_info") String str_info) {
		return tC_Review.setWorkflowDecision(str_workflowuid, str_decision, str_info);
	}

}