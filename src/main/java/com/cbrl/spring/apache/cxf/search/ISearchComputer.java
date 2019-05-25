package com.cbrl.spring.apache.cxf.search;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ISearchComputer {
	
	@WebMethod
	ResponseGetComputer getComputer(RequestGetComputer request);
}
